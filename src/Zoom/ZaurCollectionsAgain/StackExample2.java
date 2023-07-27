package Zoom.ZaurCollectionsAgain;

import java.util.Stack;

public class StackExample2 {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();
        stack.push("Zaur");
        stack.push("Katya");
        stack.push("Nikita");
        stack.push("Maksim");
        System.out.println(stack);
          // pop берет и удаляет . peak просто читает
//        while (!stack.isEmpty()){
//            System.out.println(stack.pop());
//            System.out.println(stack);
//        }
        System.out.println(stack.peek());
        System.out.println(stack);

    }
}
