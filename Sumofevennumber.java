import java.util.*;

public class Sumofevennumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0;
        int sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
            i = i + 1;
        }
        System.out.println(sum);
    }
}
