package Multithreading_Top;

public class ThreadJoin {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Method main begins");
        Thread thread = new Thread(new Worker());
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        thread.join();
        System.out.println("Method main end's");
        System.out.println(thread.getState());
        // new - до start , runnable - .start , Terminated - закончил работу поток
        // runnable - на два делиться - ready , running .

    }
}

class Worker implements Runnable {

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work end's");
    }
}
