package Multithreading_Top;

public class SynchronizedBlock {
    public static void main(String[] args) {
        MyRunnableImp2 myRunnableImp2 = new MyRunnableImp2();
        Thread thread1 = new Thread(myRunnableImp2);
        Thread thread2 = new Thread(myRunnableImp2);
        Thread thread3 = new Thread(myRunnableImp2);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2 {
    static int count = 0;
}

class MyRunnableImp2 implements Runnable {

    private void doWork2(){
        System.out.println("Ura!!!");
    }

    private void doWork1() {
        doWork2();
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }


        /*
         Monitor у каждого обекта и класса (свободен / занят)
        Monitor - это сущность/механизм , благодаря которому достигаеться
        корректная работа при синхронизации .
        В java у каждого класса и обекта есть привязанный к нему монитор.
         */

}
