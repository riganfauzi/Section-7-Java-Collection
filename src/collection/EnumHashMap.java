package collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumHashMap {
    public static enum Level {
        FREE, STANDARD, PREMIUM, VIP
    }

    public static void main(String[] args) {

        Map<Level, String> map = new EnumMap<Level, String>(Level.class);
        map.put(Level.FREE, "Rigan");
        map.put(Level.VIP, "Fauzi");

        for (var key : map.keySet()){
            System.out.println(map.get(key));
        }

    }
}
