package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LearnCollectionClas {
    public static void main(String[] args) {
        List<Students> studentsList = new ArrayList<>();

        studentsList.add(new Students("Ritu", 49));
        studentsList.add(new Students("Sayno", 39));
        studentsList.add(new Students("Ritwik", 35));
        studentsList.add(new Students("Ratna", 10));
        studentsList.add(new Students("Indra", 44));

//        Collections.sort(studentsList);
        Collections.sort(studentsList, new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        System.out.println(studentsList);


//        Students s1 = new Students("Anuj", 2);
//        Students s2 = new Students("Arti", 3);
//        System.out.println(s2.compareTo(s1));


//        List<Integer> num = new ArrayList<>();

//        num.add(2);
//        num.add(21);
//        num.add(21);
//        num.add(19);
//        num.add(89);
//
//        System.out.println(Collections.min(num));
//        System.out.println(Collections.max(num));
//        System.out.println(Collections.frequency(num, 21));
//
////        Collections.sort(num);
//        Collections.sort(num, Comparator.reverseOrder());
//        System.out.println(num);
    }
}
