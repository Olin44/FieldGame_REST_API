package pl.project.fieldgame.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.entities.LatLng;
import pl.project.fieldgame.entities.Map;
import pl.project.fieldgame.entities.ObjectOnMapDetails;
import pl.project.fieldgame.entities.Simple;
import pl.project.fieldgame.mappers.LatLngMapper;
import pl.project.fieldgame.mappers.MapMapper;
import pl.project.fieldgame.repositories.LatLngRepository;
import pl.project.fieldgame.repositories.MapRepository;
import pl.project.fieldgame.repositories.ObjectOnMapRepository;

import java.util.*;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class MapServiceImpl implements MapService {

    private final MapRepository mapRepository;
    private final MapMapper mapMapper;
    private final ObjectOnMapRepository objectOnMapRepository;
    private final LatLngRepository latLngRepository;
    private final LatLngMapper latLngMapper;

    @Override
    public List<MapDTO> getAllMaps() {
        List<Map> maps = mapRepository.findAll();
        List<String> ids = mapRepository.findAll().stream()
                .map(Map::getId)
                .collect(Collectors.toList());
        List<ObjectOnMapDetails> objectOnMapDetails =  objectOnMapRepository.findAllByMapIdIn(ids);
        List<LatLng> latLngs = getLatLngList(objectOnMapDetails);
        maps.forEach(map -> map.setObjectOnMapDetails(extractObjectOnMapDetails(objectOnMapDetails, map.getId(), latLngs)));
        return mapMapper.toDTOList(maps);
    }

    private List<ObjectOnMapDetails> extractObjectOnMapDetails(List<ObjectOnMapDetails> objectOnMapDetails, String id, List<LatLng> latLngs) {
        objectOnMapDetails.forEach(objectOnMapDetail-> objectOnMapDetail
                .setLatLng(extractLatLng(latLngs, objectOnMapDetail.getId())));

        return objectOnMapDetails.stream()
                .filter(objectOnMapDetail -> objectOnMapDetail.getMapId().equals(id))
                .collect(Collectors.toList());
    }

    private LatLng extractLatLng(List<LatLng> latLngs, String id) {
        return latLngs.stream()
                .filter(latLng -> latLng.getObjectOnMapDetailsId().equals(id)).findFirst().orElse(null);
    }

    private List<LatLng> getLatLngList(List<ObjectOnMapDetails> objectOnMapDetails){
        List<String> objectOnMapDetailsId = objectOnMapDetails
                .stream()
                .map(ObjectOnMapDetails::getId)
                .collect(Collectors.toList());
        return latLngRepository.findAllByObjectOnMapDetailsIdIn(objectOnMapDetailsId);
    }

    @Override
    public MapDTO getMapById(String mapID){
        Map map = mapRepository.getOneById(mapID);
        List<LatLng> latLngs = latLngRepository.findAllByObjectOnMapDetailsIdIn(map.getObjectOnMapDetails().stream().map(Simple::getId).collect(Collectors.toList()));
        map.getObjectOnMapDetails().forEach(objectOnMapDetail-> objectOnMapDetail
                .setLatLng(extractLatLng(latLngs, objectOnMapDetail.getId())));
        return mapMapper.toDTO(map);
    }


}
