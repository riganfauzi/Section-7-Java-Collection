package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
    public static void main(String[] args) {

        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Rigan");

        Set<String> mutable = new HashSet<>();
        mutable.add("Rigan");
        mutable.add("Fauzi");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Rigan", "Fauzi");

        // set.add ("Rigan"); error
        // set.remove("Rigan"); error

    }

}
