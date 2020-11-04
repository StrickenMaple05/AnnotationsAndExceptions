package main;

import main.annotations.MapKeyFail;
import main.annotations.MapValueFail;
import main.exceptions.MapKeyFailException;
import main.exceptions.MapValueFailException;

public class ExtendedHashMap<K, V> extends java.util.HashMap<K, V> {

    /**
     * associates value with key
     *
     * @param key key
     * @param value value
     * @return previous value
     * @throws MapKeyFailException if key is annotated with {@link MapKeyFail}
     * @throws MapValueFailException if value is annotated with {@link MapValueFail}
     */
    @Override
    public V put(K key, V value) throws MapKeyFailException, MapValueFailException {
        if (key.getClass().isAnnotationPresent(MapKeyFail.class)) {
            throw new MapKeyFailException();
        }
        if (value.getClass().isAnnotationPresent(MapValueFail.class)) {
            throw new MapValueFailException();
        }
        return super.put(key, value);
    }
}