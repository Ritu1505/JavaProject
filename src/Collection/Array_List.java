package Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        list.add(5);
//        System.out.println(list);

        //printing list using for loop
        for(int i=0; i<list.size(); i++){
//            System.out.println(i); if i use this it will print one element and then enter
            System.out.println("The element in for loop " + list.get(i));
        }

        //printing list using each for loop
        for(Integer ele : list){
            System.out.println("The element for-Each loop "+ ele);
        }

        //Printing the elements using Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            System.out.println("Iterator "+ it.next());
        }

        list.add(2,8);
        System.out.println(list);

        ArrayList<Integer> newList = new ArrayList<>();
        newList.add(12);
        newList.add(456);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(2));
        list.remove(6);
        System.out.println(list);

        list.remove(Integer.valueOf(5));
        System.out.println(list);
        list.set(2,100);
        System.out.println(list);
        System.out.println(list.contains(20));

        ArrayList cloneList;
        cloneList = (ArrayList)list.clone();
        System.out.println(cloneList);
//        list.clear();
    }
}
