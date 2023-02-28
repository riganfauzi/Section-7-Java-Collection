package collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableApp {
    public static void main(String[] args) {

        Map<String, String> map = new Hashtable<>();

        map.put("Rigan", "Rigan");
        map.put("Nur", "Nur");
        map.put("Fauzi", "Fauzi");

        for (var key : map.keySet()) {
            System.out.println(key);
        }

    }
}
