package HomeWork1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class LastWord {
//    Scanner scanner = new Scanner(System.in);
//    String s = scanner.next();
    public static int lengthOfLastWord(String s) {

        String[] letter = s.split(" ");
        String word = letter[letter.length-1];
        return word.length();

//        String[] word = Arrays.copyOfRange(letter, letter.length-1, letter.length);
        //  letter.length);
//        return word[0].length();
    }

    public static void main (String[]args){
        System.out.println(lengthOfLastWord("hello world"));

    }
}
