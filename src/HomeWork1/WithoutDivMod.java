package HomeWork1;

import java.util.Scanner;

public class WithoutDivMod {
    public static void delenie() {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int div = 0;

        while (x >= y) {
            x -= y;
            div++;
        }
        System.out.print(div + " " + x);
    }

    public static void main(String[] args) {
        delenie();
    }

}
