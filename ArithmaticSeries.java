import java.util.*;

public class ArithmaticSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int s;
        int count = 1;
        while (count <= n) {
            s = 3 * (i) + 2;
            if (s % 4 != 0) {
                System.out.print(s + " ");
                count++;
            }
            i++;
        }

    }
}
