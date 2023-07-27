package Multithreading_Top;

public class SetName_GetName {
    public static void main(String[] args) {
        MyThread6 myThread6 = new MyThread6();
        myThread6.setName("My_Thread");
        myThread6.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Name of myThread6 : " + myThread6.getName() +
                "\nPriority of myThread6 : " + myThread6.getPriority());

    }
}

class MyThread6 extends Thread {
    @Override
    public void run() {
        System.out.println("privet");
    }
}
