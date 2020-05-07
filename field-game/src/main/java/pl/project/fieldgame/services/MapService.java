package pl.project.fieldgame.services;

import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.entities.Map;
import pl.project.fieldgame.entities.ObjectOnMapDetails;
import pl.project.fieldgame.mappers.MapMapper;
import pl.project.fieldgame.repositories.MapRepository;
import pl.project.fieldgame.repositories.ObjectOnMapRepository;

import java.util.*;

@Service
public class MapService {

    private final MapRepository mapRepository;
    private final MapMapper mapMapper;
    private final ObjectOnMapRepository objectOnMapRepository;

    public MapService(MapRepository mapRepository, MapMapper mapMapper, ObjectOnMapRepository objectOnMapRepository) {
        this.mapRepository = mapRepository;
        this.mapMapper = mapMapper;
        this.objectOnMapRepository = objectOnMapRepository;
    }

    public List<MapDTO> getAllMaps(){
        return mapMapper.toDTOList(mapRepository.findAll());
    }

    public MapDTO getMapById(String mapID){
        return mapMapper.toDTO(mapRepository.getOneById(mapID));
    }
}
