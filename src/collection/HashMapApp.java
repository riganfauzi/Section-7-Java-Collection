package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Rigan");
        map.put("name.middle", "Nur");
        map.put("name.last", "Fauzi");

        System.out.println(map.get("name.last"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.first"));

    }
}
