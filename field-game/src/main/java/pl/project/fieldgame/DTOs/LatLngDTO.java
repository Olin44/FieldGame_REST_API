package pl.project.fieldgame.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class LatLngDTO extends SimpleDTO {
    private double latitude;
    private double longitude;
}
