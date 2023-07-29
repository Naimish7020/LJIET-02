import java.util.*;

public class FibonaciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int i = 1;
        int b = 1;
        while (i <= n) {
            a = b;
            b = c;
            int c = a + b;
            i++;
        }
        System.out.println(c);
    }
}
