
//   1
//  12
// 123
//1234
import java.util.*;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }
            j = 1;
            int Startingnumber = 1;
            while (j <= i) {
                System.out.print(Startingnumber);
                Startingnumber++;
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
