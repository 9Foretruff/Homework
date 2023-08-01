package Zoom.Zaur_IO_NIO_Again;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PathAndFilesExample3 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test10.txt");
//        Files.createFile(filePath);
//        String dialog = "-Privet\n-Privet\n-Kak dela?\n-Xorosho! Kak u tebya?\n-Toje xorosho!";
//        Files.write(filePath,dialog.getBytes());

        List<String> stringList = Files.readAllLines(filePath);
        for (String s : stringList) {
            System.out.println(s);
        }
    }
}
