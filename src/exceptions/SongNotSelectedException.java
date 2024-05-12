package exceptions;

public class SongNotSelectedException extends NullPointerException {
    public SongNotSelectedException(String message) {
        super(message);
    }
}
