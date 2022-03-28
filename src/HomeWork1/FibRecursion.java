package HomeWork1;

public class FibRecursion {
    public static long fibonechi(long n){
        if (n == 0){
            return 0;
        }
        if (n==1 || n==2){
            return 1;
        }

        return fibonechi(n-1)+fibonechi(n-2);

    }

    public static void main(String[] args) {
        System.out.println(fibonechi(7));
    }
}
