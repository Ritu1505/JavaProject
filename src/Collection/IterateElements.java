package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class IterateElements {
    public static void main(String[] args) {
        // Declaring the ArrayList
        Collection<String> gfg = new ArrayList<String>();

        // Appending new elements at
        // the end of the list
        gfg.add("Abhishek Rout");
        gfg.add("Vaibhav Kamble");
        gfg.add("Anupam Kumar");

        // for-each loop for iterating
        // unconditionally through collection
        for (String name : gfg)
            System.out.println("Name : " + name);

        // for loop for iterating
        // conditionally through collection
        System.out.println("Using For loop");

        for (Iterator<String> name = gfg.iterator();
             name.hasNext();)

            System.out.println("Name : " + name.next());

        // while loop for iterating
        // conditionally through collection
        System.out.println("\nUsing While Loop");

        Iterator<String> name = gfg.iterator();

        while (name.hasNext())
            System.out.println("Name : " + name.next());


        // for loop for iterating
        // through collection
        for (int i = 0; i < gfg.size(); i++)
            System.out.println("Name " + (i + 1) + ": ");
//                    + gfg.get(i));

        // forEach for iterating
        // through collection
        // with iterable variable
//        System.out.println("With iterable");
//
//        gfg.forEach((String name) -> {
//            System.out.println("Name : " + name);
//        });
//
//        System.out.println("\nWithout iterable");
//        gfg.forEach(System.out::println);
    }
}
