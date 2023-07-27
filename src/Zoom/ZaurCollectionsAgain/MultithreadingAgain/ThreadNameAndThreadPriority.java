package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class ThreadNameAndThreadPriority {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("MyThread");
        myThread5.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of thread = " + myThread5.getName());
        System.out.println("Priority of thread = " + myThread5.getPriority());
//        myThread5.start();
    }
}

class MyThread5 extends Thread {
    @Override
    public void run() {
        System.out.println("Hello!!!");
    }
}
