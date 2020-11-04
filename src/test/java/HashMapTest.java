import main.books.Book;
import main.books.MarkedBook;
import main.exceptions.MapKeyFailException;
import main.exceptions.MapValueFailException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.ExtendedHashMap;

public class HashMapTest {

    /**
     * test on {@link ExtendedHashMap} initialized with unmarked types
     */
    @Test
    public void unmarkedTypesTest() {
        ExtendedHashMap<Integer, Book> map = new ExtendedHashMap<>();
        Book book = new Book("title", "author", "genre");
        map.put(0, book);
        Assertions.assertEquals(book, map.get(0));
    }

    /**
     * test on {@link ExtendedHashMap} initialized with marked key
     */
    @Test
    public void markedKeyTest() {
        ExtendedHashMap<Book, Integer> map = new ExtendedHashMap<>();
        Book book = new MarkedBook("title", "author", "genre");
        Assertions.assertThrows(MapKeyFailException.class, () -> map.put(book,0));
    }

    /**
     * test on {@link ExtendedHashMap} initialized with marked value
     */
    @Test
    public void markedValueTest() {
        ExtendedHashMap<Integer, Book> map = new ExtendedHashMap<>();
        Book book = new MarkedBook("name", "author", "genre");
        Assertions.assertThrows(MapValueFailException.class, () -> map.put(0, book));
    }
}
