package Zoom;
import java.io.*;

public class I_O {
    public static void main(String[] args) {

//        byte [] arr = {121, 100 , 89 , 33};
//
//        try (var ByteArrayInputStream = new ByteArrayInputStream(arr)){
//            int i = 0;
//            while ((i = ByteArrayInputStream.read())!=-1){
//                System.out.print((char) i);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//-------------------------------

        try(var byteArrayOutputStream = new ByteArrayOutputStream(12)){
           byteArrayOutputStream.write("Hello from Idea!".getBytes());
           byte [] bytes = byteArrayOutputStream.toByteArray();
           var byteArrayInput = new ByteArrayInputStream(bytes);
           while (byteArrayInput.available() > 0){
               System.out.print((char) byteArrayInput.read());
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //------------------------------------
    }
}
