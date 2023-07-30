package Zoom.Zaur_IO_NIO_Again;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferExample2 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test5.txt", "r");
             FileChannel channel = file.getChannel()) {
            ByteBuffer buffer = ByteBuffer.allocate(5);
            channel.read(buffer); // a b c d e
            buffer.flip();
            System.out.println((char)buffer.get()); //a
            System.out.println((char)buffer.get()); //b
            System.out.println((char)buffer.get()); //c
            buffer.rewind(); // вернет позицию на 0
            System.out.println((char)buffer.get()); //a

            System.out.println("-------------------------");
            buffer.compact();
            channel.read(buffer);
            buffer.flip();
            while (buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }
            System.out.println("-------------------------");
            buffer.clear();
            //buffer.compact(); // не удаляет значения в буфере если мы от туда не прочитали какие-то елементы

            channel.read(buffer);
            buffer.flip();
            System.out.println((char) buffer.get());
            buffer.mark();
            System.out.println((char) buffer.get());
            System.out.println((char) buffer.get());
            buffer.reset();
            while (buffer.hasRemaining()){
                System.out.println((char) buffer.get());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
