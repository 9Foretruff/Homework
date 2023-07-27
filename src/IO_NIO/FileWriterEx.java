package IO_NIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {
    public static void main(String[] args) {
        String rubai = "helo helo hah \n jsafjasdjf \n fsdfsd \n";
        String s = "privet";
        try (FileWriter writer = new FileWriter("test2.txt", true);) {
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            //writer.write(rubai);
            writer.write(s);
            System.out.println("Done");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
