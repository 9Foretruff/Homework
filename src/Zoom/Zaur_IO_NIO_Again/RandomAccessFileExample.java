package Zoom.Zaur_IO_NIO_Again;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileExample {
    public static void main(String[] args) {                        // rw - read write
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw")) {

            int a = file.read();
            System.out.println((char) a);
            String s1 = file.readLine();
            System.out.println(s1);

            file.seek(101);
            s1 = file.readLine();
            System.out.println(s1);

            long position = file.getFilePointer();
            System.out.println(position);

//            file.seek(0);
//            file.writeBytes("privet");

            file.seek(file.length() - 1);
            file.writeBytes("\n\t\t\t\tTaras Shevchenko");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

