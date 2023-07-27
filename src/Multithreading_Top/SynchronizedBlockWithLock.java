package Multithreading_Top;

public class SynchronizedBlockWithLock {

    static final Object lock = new Object();
    public static void main(String[] args) {
        Thread mobile = new Thread(new MobileCall());
        Thread skype = new Thread(new SkypeCall());
        Thread telegram = new Thread(new TelegramCall());
        mobile.start();
        skype.start();
        telegram.start();
    }

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends ");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call starts");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends ");
        }
    }

    void telegramCall() {
        synchronized (lock) {
            System.out.println("Telegram call starts");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Telegram call ends ");
        }
    }
}

class MobileCall implements Runnable {

    @Override
    public void run() {
        new SynchronizedBlockWithLock().mobileCall();
    }
}

class SkypeCall implements Runnable {

    @Override
    public void run() {
        new SynchronizedBlockWithLock().skypeCall();
    }
}

class TelegramCall implements Runnable {

    @Override
    public void run() {
        new SynchronizedBlockWithLock().telegramCall();
    }
}



