package Zoom.LambdaJR;

import java.util.function.Function;

public class Example6 {
    public static void main(String[] args) {
        Function<String , Integer> symbolCounter = (text)->{
            System.out.println("Start....");
            return text.length();
        };

    }

    public int nonStaticCounter(String message){
        return message.length();
    }
}
