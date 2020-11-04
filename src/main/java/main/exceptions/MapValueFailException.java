package main.exceptions;
import main.ExtendedHashMap;

/**
 * exception thrown when value is marked
 * @see ExtendedHashMap
 */
public class MapValueFailException extends RuntimeException {

    public MapValueFailException() {
        super();
    }
}