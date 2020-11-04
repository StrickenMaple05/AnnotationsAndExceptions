package main.exceptions;

import main.ExtendedHashMap;

/**
 * exceptions thrown when key is marked
 * @see ExtendedHashMap
 */
public class MapKeyFailException extends RuntimeException {

    public MapKeyFailException() {
        super();
    }
}