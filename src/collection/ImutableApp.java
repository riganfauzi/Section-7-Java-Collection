package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImutableApp {
    public static void main(String[] args) {

        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Rigan");
        mutable.add("Fauzi");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("Rigan", "Nur", "Fauzi");

    }
}
