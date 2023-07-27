package Zoom.ZaurCollectionsAgain.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAndLinkedList {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.offer("Zaur");
        queue.offer("Maksim");
        queue.offer("Katya");
        queue.offer("Nekit");
        queue.offer("Ihor");

        System.out.println(queue);
        queue.remove("Zaur");
        System.out.println(queue);
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        //System.out.println(queue.element());
        System.out.println(queue.poll());
        System.out.println(queue.peek());


    }
}
