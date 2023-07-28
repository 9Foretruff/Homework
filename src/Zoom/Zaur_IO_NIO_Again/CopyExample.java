package Zoom.Zaur_IO_NIO_Again;

import java.io.*;

public class CopyExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\mi200\\Desktop\\javasss.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(
                     new FileWriter("Test3.txt"))) {
//            int character;
//            while ((character = reader.read()) != -1) {
//                bufferedWriter.write(character);
//            }
            String line;
            while ((line = reader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.write('\n');
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
