package pl.project.fieldgame.services;

import pl.project.fieldgame.DTOs.MapDTO;

import java.util.List;

public interface MapService {
    List<MapDTO> getAllMaps();

    MapDTO getMapById(String mapID);
}
