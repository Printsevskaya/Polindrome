package HomeWork1;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int x) {
            String str = String.valueOf(x);
            return str.equals(new StringBuilder().append(str).reverse().toString());
        }
        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            System.out.println(isPalindrome(x));
        }
    
}
