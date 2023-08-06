package Zoom.SerilizationSimpleExamples.UserFromJr;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileOutputStream fileOutputStream = new FileOutputStream("passport.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        UserInfo userInfo = new UserInfo("Ivan", "Ivanov", "Ivan Ivanov's passport data");

        objectOutputStream.writeObject(userInfo);

        objectOutputStream.close();

    }
}