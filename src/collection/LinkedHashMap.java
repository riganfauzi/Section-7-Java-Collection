package collection;

import java.util.Map;
import java.util.Set;

public class LinkedHashMap {
    public static void main(String[] args) {

        Map<String, String> map = new java.util.LinkedHashMap<>();

        map.put("first", "Rigan");
        map.put("last", "Fauzi");
        map.put("middle", "Nur");

        Set<String> keys = map.keySet();
        for (var key : keys);
        System.out.println(keys);

    }
}
