import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        while (i < n) {
            if (n % i == 0) {
                System.out.println("it is a not a prime number");
                return;
            }
            i = i + 1;
        }
        System.out.println("it is a prime number ");

    }
}
