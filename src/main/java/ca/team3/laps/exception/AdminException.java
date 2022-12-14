package ca.team3.laps.exception;

public class AdminException extends Exception {
    private ErrorJson error;

    public AdminException(ErrorJson error) {
        this.error = error;
    }

    public ErrorJson getError() {
        return error;
    }
}
