package Zoom.Zaur_IO_NIO_Again.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationEx1 {
    public static void main(String[] args) {
        List<String>employees = new ArrayList<>();
        employees.add("Maksim");
        employees.add("Zaur");
        employees.add("Nikita");
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees1.bin"))){
            outputStream.writeObject(employees);
            System.out.println("Done!!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
