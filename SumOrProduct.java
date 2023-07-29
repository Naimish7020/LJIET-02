import java.util.*;

public class SumOrProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();
        if (c == 1) {
            int i = 1;
            int sum = 0;
            while (i <= n) {
                sum = sum + i;
                i++;
            }
            System.out.println(sum);
        } else if (c == 2) {
            int i = 1;
            int mul = 1;
            while (i <= n) {
                mul = mul * i;
                i++;
            }
            System.out.println(mul);
        } else {
            System.out.println("-1");
        }

    }
}
