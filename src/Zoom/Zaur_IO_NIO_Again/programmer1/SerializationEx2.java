package Zoom.Zaur_IO_NIO_Again.programmer1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota camry", "black");
        Employee employees = new Employee("Maksim", "Rokitko", "IT", 1000, car);
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("employees2.bin"))) {
            outputStream.writeObject(employees);
            System.out.println("Done !!!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
