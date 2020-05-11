package pl.project.fieldgame.services;

import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class APIError {
    private String message;
}
