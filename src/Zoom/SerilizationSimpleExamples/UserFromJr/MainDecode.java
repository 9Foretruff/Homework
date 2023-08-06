package Zoom.SerilizationSimpleExamples.UserFromJr;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDecode {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("passport.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);


        UserInfo userInfo = (UserInfo) objectInputStream.readObject();
        System.out.println(userInfo);

        objectInputStream.close();

    }
}





