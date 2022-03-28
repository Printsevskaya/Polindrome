package HomeWork1;

import java.util.Scanner;

public class FizzBuzz {

public static void fizzBuzz(){
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();

    if (x%3==0 && x%5==0){
    System.out.println("HomeWork1.FizzBuzz");
    }
    else if (x%5==0){
        System.out.println("Buzz");
    }
    else if(x%3 == 0){
        System.out.println("Fizz");
    }
    else {
        System.out.println("Very bad number");
    }
}
    public static void main(String[] args) {
        fizzBuzz();
    }

}
