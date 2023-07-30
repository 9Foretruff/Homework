package Zoom.Zaur_IO_NIO_Again;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelBufferEx1 {
    public static void main(String[] args) {
        try (RandomAccessFile file = new RandomAccessFile("test10.txt", "rw");
             FileChannel channel = file.getChannel()) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(25);
            StringBuilder stix = new StringBuilder();

            int byteRead = channel.read(byteBuffer);
            while (byteRead > 0) {
                System.out.println("Read " + byteRead);

                byteBuffer.flip(); // меняет режим

                while (byteBuffer.hasRemaining()) {
                    stix.append((char) byteBuffer.get());
                }
                byteBuffer.clear();
                byteRead = channel.read(byteBuffer);
            }
            System.out.println(stix);

            String text = "\nBattle on – and win your battle!";

//            ByteBuffer byteBuffer1 = ByteBuffer.allocate(text.getBytes().length);
//            byteBuffer1.put(text.getBytes());
//            byteBuffer1.flip();
//            channel.write(byteBuffer1);
            ByteBuffer byteBuffer2 = ByteBuffer.wrap(text.getBytes());
            channel.write(byteBuffer2);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
