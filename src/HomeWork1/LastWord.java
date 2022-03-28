package HomeWork1;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class LastWord {
    public static int lengthOfLastWord(String s) {

        String[] letter = s.split(" ");
        String word = letter[letter.length-1];
        return word.length();

    }

    public static void main (String[]args){
        System.out.println(lengthOfLastWord("hello world"));

    }
}
