package Multithreading_Top;

public class ThreadWithRun implements Runnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadWithRun());
        thread.start(); //thread.run(); <-- net
        System.out.println("Method main\nThread name : "
                + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        System.out.println("Method run\nThread name : "
                + Thread.currentThread().getName());
    }

}
