package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionApp {
    public static void main(String[] args) {

        Collection<String> collection = new ArrayList<>();

        collection.add("Rigan");
        collection.add("Nur");
        collection.add("Fauzi");
        collection.addAll(List.of("18", "Years", "Old"));

        collection.remove("Nur");
        collection.removeAll(List.of("18", "Years", "Old"));

        for (var value : collection) {
            System.out.println(value);
        }

        System.out.println(
                collection.contains("Rigan")
        );

        System.out.println(
                collection.containsAll(List.of("Fauzi", "18"))
        );

    }
}
