package pl.project.fieldgame.services;

import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.DTOs.ObjectOnMapDetailsDTO;
import pl.project.fieldgame.mappers.MapMapper;
import pl.project.fieldgame.repositories.MapRepository;

import java.util.*;

@Service
public class SimpleService{

    private final MapRepository mapRepository;
    private final MapMapper mapMapper;

    public SimpleService(MapRepository mapRepository, MapMapper mapMapper) {
        this.mapRepository = mapRepository;
        this.mapMapper = mapMapper;
    }

    public List<MapDTO> getAllMaps(){
        List<MapDTO> mapDTOList = new ArrayList<>();
        MapDTO mapDTO = new MapDTO();
        mapDTO.setName("testMap");
        List<ObjectOnMapDetailsDTO> objectOnMapDetails = new ArrayList<>();
        ObjectOnMapDetailsDTO objectOnMapDetails1 = new ObjectOnMapDetailsDTO();
        objectOnMapDetails1.setHint("testObjectDetails");
        objectOnMapDetails.add(objectOnMapDetails1);
        mapDTO.setObjectOnMapDetails(objectOnMapDetails);
        mapDTOList.add(mapDTO);
        mapDTOList.addAll(mapMapper.toDTOList(mapRepository.findAll()));
        return mapDTOList;
    }
}
