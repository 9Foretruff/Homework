package Zoom.SerilizationSimpleExamples;

import java.io.*;

public class TestMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Test2 test2 = new Test2();
        test2.setName("adsd");
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("test22"));
        outputStream.writeObject(test2);

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("test22"));
        Test2 test21 = (Test2) inputStream.readObject();
        System.out.println(test21);

    }
}
