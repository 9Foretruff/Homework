package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class ExampleWithMethodRun implements Runnable{

    @Override
    public void run() {
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ExampleWithMethodRun());
        thread.start();
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
