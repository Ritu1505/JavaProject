package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        Queue<Integer> num = new LinkedList<>();
        num.offer(23);
        num.offer(27);
        num.offer(39);
        num.add(78);
        System.out.println(num);
        num.poll();
        System.out.println(num);
        System.out.println(num.peek());

        /* Here we can use add also instead of offer but if any problem arises it will
        through an exception whereas the offer will say false.

        we can use remove in case of poll but the same thing will happen
        it will through an exception if it cant be done but poll will return null

        In case of peek() also it will return null if there is no value but if we use
        element it will throw an exception if there is no element present
         */
    }
}
