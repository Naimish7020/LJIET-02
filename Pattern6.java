
//1
//23
//345
//4567
//56789
import java.util.*;

public class Pattern6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int startingnumber = i;
            while (j <= i) {
                System.out.print(startingnumber);
                startingnumber++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
