import java.util.*;
import java.math.*;

public class BinarytoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("0");
        } else {
            int sum = 0;
            int count = 0;
            while (n > 0) {
                int n1 = n % 10;
                int n2 = n / 10;
                n = n2;
                if (n1 == 0) {
                    count++;
                } else {
                    double n3 = n1 * Math.pow(2, count);
                    int n4 = (int) (n3);
                    sum = sum + n4;
                    count++;
                }
            }
            System.out.print(sum);
        }

    }
}
