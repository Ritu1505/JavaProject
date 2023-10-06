package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnHashMap {
    public static void main(String[] args) {
//        Map<String, Integer> number = new HashMap<>();
        Map<String, Integer> number = new TreeMap<>();

        number.put("One", 1);
        number.put("Two", 2);
        number.put("Three", 3);
        number.put("Four", 4);
//        number.put("Five", 5);
//        number.put("Six", 6);

        System.out.println(number);

        if(!number.containsKey("Two")){
            number.put("seven", 7);
        }

        number.putIfAbsent("Seven",4);
        System.out.println(number);

        System.out.println(number.containsValue(3));

        // Different ways to traverse and print the elements
        for(Map.Entry<String, Integer> e: number.entrySet()){
            System.out.println(e);

            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        for(String key: number.keySet()){
            System.out.println(key);
        }

        for (Integer val: number.values()){
            System.out.println(val);
        }
    }
}
