package ca.team3.laps.exception;


import lombok.Data;

@Data
public class ErrorJson {
    private int code;
    private String message;

    public ErrorJson (int code, String message) {
        this.code = code;
        this.message = message;
    }
}
