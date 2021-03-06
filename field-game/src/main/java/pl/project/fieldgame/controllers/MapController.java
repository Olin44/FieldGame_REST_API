package pl.project.fieldgame.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.services.ApiException;
import pl.project.fieldgame.services.MapServiceImpl;
import pl.project.fieldgame.services.APIError;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/maps")
public class MapController {

    private final MapServiceImpl mapService;

    @GetMapping("/getAllMaps")
    List<MapDTO> getAllMaps() {
        return mapService.getAllMaps();
    }

    @GetMapping("/getMapById/{mapID}")
    MapDTO getMapById(@PathVariable String mapID){
        return mapService.getMapById(mapID);
    }
}
