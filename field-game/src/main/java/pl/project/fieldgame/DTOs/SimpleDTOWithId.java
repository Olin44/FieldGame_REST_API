package pl.project.fieldgame.DTOs;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class SimpleDTOWithId extends SimpleDTO{
    String id;
}
