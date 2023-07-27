package Zoom.ZaurCollectionsAgain.Queue;

import java.util.PriorityQueue;

public class PriorityQueueExample1 {
    public static void main(String[] args) {
        PriorityQueue<Integer>priorityQueue = new PriorityQueue<>();
        priorityQueue.add(4);
        priorityQueue.add(1);
        priorityQueue.add(7);
        priorityQueue.add(10);
        priorityQueue.add(8);
        // 1 4 7 8 10 ( 1 - найвыший приоритет )
        System.out.println(priorityQueue);
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        //System.out.println(priorityQueue.peek());

    }
}
