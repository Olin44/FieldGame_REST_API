package pl.project.fieldgame.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import pl.project.fieldgame.services.APIError;
import pl.project.fieldgame.services.ApiException;

@ControllerAdvice
public class ProductExceptionController {

    @ExceptionHandler(value = ApiException.class)
    public ResponseEntity<Object> handleException(ApiException exception) {
        APIError error = new APIError(exception.getMessage());
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }
}