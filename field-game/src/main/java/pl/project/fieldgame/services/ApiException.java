package pl.project.fieldgame.services;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiException extends RuntimeException  {
    public ApiException(String exception) {
        super(exception);
    }
}
