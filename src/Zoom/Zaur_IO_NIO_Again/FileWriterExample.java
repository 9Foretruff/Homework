package Zoom.Zaur_IO_NIO_Again;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        String text = "hello , okay \n okay bye";
        String s = " Maksim";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("C:\\Users\\mi200\\Desktop\\javasss.txt",true);
            //fileWriter = new FileWriter("Test2"); // относительный путь
//            for (int i = 0; i < text.length(); i++) {
//                fileWriter.write(text.charAt(i));
//            }
            //fileWriter.write(text);
            fileWriter.write(s);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.close();
        }
    }
}
