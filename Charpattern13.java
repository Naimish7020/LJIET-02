
//D
//CD
//BCD
//ABCD
import java.util.*;

public class Charpattern13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int startingchar;
        while (i <= n) {
            int j = 1;
            startingchar = 'A' + n - i;
            while (j <= i) {
                System.out.print((char) (startingchar));
                startingchar++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
