package Multithreading_Top;

import java.util.Scanner;

public class DataRace_SynchronizedMethods {
    public static void main(String[] args) {
        MyRunnableImp1 myRunnableImp1 = new MyRunnableImp1();
        Thread thread1 = new Thread(myRunnableImp1);
        Thread thread2 = new Thread(myRunnableImp1);
        Thread thread3 = new Thread(myRunnableImp1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImp1 implements Runnable {

    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() { //Data Race
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}

