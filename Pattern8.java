
//1
//21
//321
//4321
//54321
import java.util.*;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int startingnumber = i;
            while (j <= i) {
                System.out.print(startingnumber);
                j++;
                startingnumber--;
            }
            System.out.println();
            i++;
        }
    }
}
