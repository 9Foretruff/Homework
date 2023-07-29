package Zoom.Zaur_IO_NIO_Again;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample2 {
    public static void main(String[] args) {
        try (FileInputStream inputStream = new FileInputStream("C:\\Users\\mi200\\Desktop\\sigma photo.jpg");
             FileOutputStream fileOutputStream = new FileOutputStream("sigma photo.jpg");
        ) {
            int i;
            while ((i = inputStream.read()) != -1) {
                fileOutputStream.write(i);
            }
            System.out.println("Done!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
