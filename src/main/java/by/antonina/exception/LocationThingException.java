package by.antonina.exception;

public class LocationThingException extends Exception {
    public LocationThingException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Локация не может быть пустой";
    }
}
