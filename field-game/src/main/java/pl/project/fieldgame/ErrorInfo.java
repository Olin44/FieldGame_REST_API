package pl.project.fieldgame;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class ErrorInfo {

    @JsonProperty
    private String message;

    @JsonProperty("timestamp")
    private Date timestamp;

    @JsonProperty("uri")
    private String uriRequested;

    public ErrorInfo(Exception exception, String uriRequested) {
        this.message = exception.toString();
        this.uriRequested = uriRequested;
        this.timestamp = new Date();
    }
}
