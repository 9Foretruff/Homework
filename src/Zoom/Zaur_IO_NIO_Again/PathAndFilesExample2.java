package Zoom.Zaur_IO_NIO_Again;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathAndFilesExample2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Paths.get("test15.txt");
        Path directoryPath = Paths.get("C:\\Users\\mi200\\Desktop\\m");
        Path directoryBPath = Paths.get("C:\\Users\\mi200\\Desktop\\B");

//        Files.copy(filePath,directoryPath.resolve(filePath));
//        Files.copy(filePath,directoryPath.resolve("test16.txt"), StandardCopyOption.REPLACE_EXISTING);
//        Files.copy(directoryBPath,directoryPath.resolve("B"));
//        System.out.println("Done");

//        Files.move(filePath, directoryPath.resolve("test15.txt"));

//        Files.move(Paths.get("test10.txt"),(Paths.get("test11.txt"))); //rename

//        Files.delete(Paths.get("test5.txt"));
//        Files.delete(directoryPath); нельзя удалять папку если там есть файлы . как сделать будет в следущем примере

    }
}
