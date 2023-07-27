package Zoom.ZaurCollectionsAgain.MultithreadingAgain;

public class MonitorExampleWithPhones {
    static final Object lock = new Object();
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpTelegram());

        thread1.start();
        thread2.start();
        thread3.start();
    }

    void mobileCall() {
        synchronized (lock) {
            System.out.println("Mobile call stars");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call end's");
        }
    }

    void skypeCall() {
        synchronized (lock) {
            System.out.println("Skype call stars");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call end's");
        }
    }

    void telegramCall() {
        synchronized (lock) {
            System.out.println("Telegram call stars");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Telegram call end's");
        }
    }
}

class RunnableImpMobile implements Runnable{
    @Override
    public void run() {
        new MonitorExampleWithPhones().mobileCall();
    }
}
class RunnableImpSkype implements Runnable{
    @Override
    public void run() {
        new MonitorExampleWithPhones().skypeCall();
    }
}
class RunnableImpTelegram implements Runnable{
    @Override
    public void run() {
        new MonitorExampleWithPhones().telegramCall();
    }
}

