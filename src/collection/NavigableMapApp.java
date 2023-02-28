package collection;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapApp {
    public static void main(String[] args) {

        NavigableMap<String, String> map = new TreeMap<>();

        map.put("Rigan", "Rigan");
        map.put("Nur", "Nur");
        map.put("Fauzi", "Fauzi");

        for (var key : map.keySet()){
            System.out.println(key);
        }

        System.out.println(map.lowerKey("Rigan"));
        System.out.println(map.higherKey("Rigan"));

        NavigableMap<String, String> mapDesc = map.descendingMap();
        for (var key : mapDesc.keySet()){
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);

//        immutable.put("Rigan", "Rigan"); error

    }
}
