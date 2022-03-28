package HomeWork1;

import java.util.ArrayList;

public class Fibonachi {

    public static void fibonachi(int finish) {
        long zero = 0;
        long one = 1;

        if (finish == 0) {
            System.out.println("0");
        } else {
            while (finish - 2 > 0) {
                long k = zero;
                zero = one;
                one = k + zero;
                finish -= 1;
            }
            System.out.println(one);
        }
    }

    public static void main(String[] args) {
        fibonachi(8);
    }
}
