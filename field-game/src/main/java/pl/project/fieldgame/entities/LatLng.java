package pl.project.fieldgame.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class LatLng extends Simple{
    private double latitude;
    private double longitude;
    @JsonIgnore
    private String objectOnMapDetailsId;
}
