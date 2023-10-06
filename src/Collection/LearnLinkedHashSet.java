package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        set.add(23);
        set.add(56);
        set.add(42);
        set.add(87);
        set.add(67);
        set.add(49);
        set.add(39);
        System.out.println(set);

        set.remove(67);
        System.out.println(set);

        System.out.println(set.contains(93));
        System.out.println(set.contains(49));

        System.out.println(set.isEmpty());
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
