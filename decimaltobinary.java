import java.util.*;
import java.math.*;

public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("0");
        } else {
            int count = 0;
            int ans1 = 0;
            while (n > 0) {
                int rem = n % 2;
                double c = Math.pow(10, count);
                ans1 += rem * c;
                n = n / 2;
                count++;
            }
            System.out.print(ans1);
        }

    }
}
