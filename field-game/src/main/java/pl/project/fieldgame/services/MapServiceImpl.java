package pl.project.fieldgame.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.entities.Map;
import pl.project.fieldgame.entities.ObjectOnMapDetails;
import pl.project.fieldgame.mappers.MapMapper;
import pl.project.fieldgame.repositories.MapRepository;
import pl.project.fieldgame.repositories.ObjectOnMapRepository;

import java.util.*;

@Service
@RequiredArgsConstructor
public class MapServiceImpl implements MapService {

    private final MapRepository mapRepository;
    private final MapMapper mapMapper;

    @Override
    public List<MapDTO> getAllMaps(){
        return mapMapper.toDTOList(mapRepository.findAll());
    }

    @Override
    public MapDTO getMapById(String mapID){
        return mapMapper.toDTO(mapRepository.getOneById(mapID));
    }
}
