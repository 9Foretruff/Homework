package Zoom.Zaur_IO_NIO_Again;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) throws IOException {
        try (FileReader reader = new FileReader("C:\\Users\\mi200\\Desktop\\javasss.txt")) {
            int character;
            while ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
            System.out.println();
            System.out.println("Done");
        }
    }
}
