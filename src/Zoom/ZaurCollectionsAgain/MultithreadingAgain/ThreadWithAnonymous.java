package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class ThreadWithAnonymous {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        }).start();
        new Thread(() -> System.out.println("hello2")).start();
    }
}
