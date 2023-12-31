package Zoom.Zaur_IO_NIO_Again;

import java.io.*;

public class DataStreamsExample {
    public static void main(String[] args) {
        try (DataOutputStream outputStream = new DataOutputStream(new FileOutputStream("my_text.bin"));
             DataInputStream inputStream = new DataInputStream(new FileInputStream("my_text.bin"))) {
            outputStream.writeBoolean(true);
            outputStream.writeByte(5);
            outputStream.writeShort(120);
            outputStream.writeInt(500);
            outputStream.writeLong(1_000_000L);
            outputStream.writeFloat(3.13F);
            outputStream.writeDouble(123.456);

            System.out.println(inputStream.readBoolean());
            System.out.println(inputStream.readByte());
            System.out.println(inputStream.readShort());
            System.out.println(inputStream.readInt());
            System.out.println(inputStream.readLong());
            System.out.println(inputStream.readFloat());
            System.out.println(inputStream.readDouble());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
