package io.turntabl.machine;

/**
 * @author: Rhume Disi
 */
public class WrongHostnameException extends IllegalArgumentException {

    private String message;

    public WrongHostnameException(String hostname) {
        this.message = hostname;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "WrongHostnameException{message='" + message + '}';
    }
}
