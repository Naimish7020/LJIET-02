
//4444
//4444
//4444
//4444
import java.util.*;

public class Pettern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n) {
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
