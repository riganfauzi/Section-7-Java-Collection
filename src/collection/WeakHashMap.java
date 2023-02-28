package collection;

import java.util.HashMap;
import java.util.Map;

public class WeakHashMap {
    public static void main(String[] args) {

            Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 1_000_000; i++){
            map.put(i, i);
        }

        System.gc();

        System.out.println(map.size());

    }
}
