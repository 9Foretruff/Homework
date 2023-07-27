package IO_NIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("test2.txt")) {
            int x = 0;
            while ((x = fileReader.read()) != -1) {
                System.out.print((char) x);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

