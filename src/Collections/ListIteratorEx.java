package Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorEx {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> characters = new LinkedList<>();
        for (char ch : s.toCharArray()) {
            characters.add(ch);
        }
        ListIterator<Character> iterator = characters.listIterator();
        ListIterator<Character> reverseIterator = characters.listIterator(characters.size());
        boolean isPalindrome = true;
        while (iterator.hasNext() && reverseIterator.hasPrevious()) {
            if (iterator.next()!=reverseIterator.previous()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Palindrome : " + isPalindrome);
    }
}
