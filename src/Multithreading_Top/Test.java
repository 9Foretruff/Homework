package Multithreading_Top;

public class Test {
    public static void main(String[] args) {
        WriterTest writerTest = new WriterTest();
        ThreadTest1 threadTest1 = new ThreadTest1(writerTest);
        ThreadTest2 threadTest2 = new ThreadTest2(writerTest);
        threadTest1.start();
        threadTest2.start();
    }
}

class WriterTest {
    public synchronized void printWord(String word) {
        notify();
        System.out.print(word);
        try {
            wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class ThreadTest1 extends Thread {
    private WriterTest writerTest;

    public ThreadTest1(WriterTest writerTest) {
        this.writerTest = writerTest;
    }

    @Override
    public void run() {
        while (true) {
            writerTest.printWord("A");
        }
    }
}

class ThreadTest2 extends Thread {
    private WriterTest writerTest;

    public ThreadTest2(WriterTest writerTest) {
        this.writerTest = writerTest;
    }

    @Override
    public void run() {
        while (true) {
            writerTest.printWord("B");
        }
    }
}

