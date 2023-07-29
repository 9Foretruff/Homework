package Zoom.Zaur_IO_NIO_Again.programmer2;

import Zoom.Zaur_IO_NIO_Again.programmer1.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerializationEx2 {
    public static void main(String[] args) {
        Employee bestEmployee;
        try(ObjectInputStream objectInputStream= new ObjectInputStream(new FileInputStream("employees2.bin"))){
            bestEmployee = (Employee) objectInputStream.readObject();
            System.out.println(bestEmployee);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
