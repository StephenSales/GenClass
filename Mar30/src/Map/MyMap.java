package Map;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MyMap<O> {
    ArrayList<O> keys = new ArrayList<>();
    ArrayList<O> values = new ArrayList<>();

    public void put(O key, O value) {
        if (keys.contains(key)) {
            values.set(keys.indexOf(key), value);
        } else {
            keys.add(key);
            values.add(value);
        }
    }

    public O get(O key) {
        if (keys.contains(key)) {
            return values.get(keys.indexOf(key));
        }
        return null;
    }

    public O remove(O key) {
        if (keys.contains(key)) {
            O temp = values.remove(keys.indexOf(key));
            keys.remove(key);
            return temp;
        }
        return null;
    }
}
