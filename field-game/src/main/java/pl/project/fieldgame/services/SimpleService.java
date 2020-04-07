package pl.project.fieldgame.services;

import org.springframework.stereotype.Service;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.DTOs.ObjectOnMapDetailsDTO;
import pl.project.fieldgame.entities.ObjectOnMapDetails;
import pl.project.fieldgame.mappers.MapMapper;
import pl.project.fieldgame.repositories.MapRepository;

import java.util.*;

@Service
public class SimpleService{
    private MapRepository mapRepository;
    private MapMapper mapMapper;

    public SimpleService(MapRepository mapRepository, MapMapper mapMapper) {
        this.mapRepository = mapRepository;
        this.mapMapper = mapMapper;
    }

    public List<MapDTO> getAllMaps(){
        return mapMapper.toDTOList(mapRepository.findAll());
    }
}
