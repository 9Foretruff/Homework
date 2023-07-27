package Zoom.ZaurCollectionsAgain.Queue;

import java.time.LocalTime;
import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAndArrayDeque {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(3);
        deque.addFirst(5);
        deque.addLast(7);
        deque.offerFirst(1);
        deque.offerLast(8);
        // 1 5 3 7 8
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());
        System.out.println(deque.removeLast());
        System.out.println(deque);
        System.out.println(deque.pollFirst());
        System.out.println(deque);
        System.out.println(deque.pollLast());
        System.out.println(deque);
        // 1 8 5 7
        LocalTime localTime1 = LocalTime.now();
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
