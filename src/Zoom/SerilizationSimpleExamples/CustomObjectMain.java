package Zoom.SerilizationSimpleExamples;

import java.io.*;

public class CustomObjectMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        CustomObject customObject = new CustomObject();
        customObject.setBb(122);
        ObjectOutputStream outputStream1 = new ObjectOutputStream(new FileOutputStream("test222"));
        customObject.writeExternal(outputStream1);

        outputStream1.flush();
        outputStream1.close();

        ObjectInputStream inputStream1 = new ObjectInputStream(new FileInputStream("test222"));
        CustomObject customObject1 = new CustomObject();
        customObject1.readExternal(inputStream1);
        System.out.println(customObject1);
    }
}
