package pl.project.fieldgame.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.project.fieldgame.DTOs.MapDTO;
import pl.project.fieldgame.services.SimpleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/controllers")
public class SimpleController {

    private final SimpleService simpleService;

    @RequestMapping("/allMaps")
    List<MapDTO> getAllMaps(){
        return simpleService.getAllMaps();
    }
}
