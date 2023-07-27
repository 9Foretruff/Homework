package Multithreading_Top;

public class ThreadWithRunnable {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread4());
        Thread thread2 = new Thread(new MyThread5());
        thread1.start();
        thread2.start();
    }
}

class MyThread4 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
    }
}

class MyThread5 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i >= 0; i--) {
            System.out.println(i);
        }
    }
}


