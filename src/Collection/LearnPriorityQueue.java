package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.offer(23);
        pq.offer(27);
        pq.offer(39);
        pq.add(78);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());

        //This works like max heap and min heap
        // By default it works like Min heap and when it is set in reverse order
        // it will work as Max heap
    }
}
