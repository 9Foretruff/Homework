package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class DaemonExample {
    public static void main(String[] args) throws InterruptedException {
        // User threads , daemon threads
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("UserThread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("DaemonThread");
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName() + " is daemon: " + this.isDaemon());
        for (char i = 'A'; i <= 'J'; i++) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println(currentThread().getName() + " is daemon: " + this.isDaemon());
        for (int i = 1; i <= 1000; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }
}
