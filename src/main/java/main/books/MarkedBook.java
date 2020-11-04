package main.books;

import main.ExtendedHashMap;
import main.annotations.MapKeyFail;
import main.annotations.MapValueFail;

/**
 * marked book
 * @see ExtendedHashMap
 */
@MapKeyFail
@MapValueFail
public class MarkedBook extends Book {

    public MarkedBook(String name, String author, String genre) {
        super(name, author, genre);
    }
}
