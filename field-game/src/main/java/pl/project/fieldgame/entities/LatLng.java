package pl.project.fieldgame.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class LatLng extends SimpleEntity {
    private double latitude;
    private double longitude;
    @JsonIgnore
    private String objectOnMapDetailsId;
}
