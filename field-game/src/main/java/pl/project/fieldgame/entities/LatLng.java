package pl.project.fieldgame.entities;


import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
public class LatLng extends Simple{
    private double latitude;
    private double longitude;
}
