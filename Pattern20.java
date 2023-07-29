
//    *
//   ***
//  *****
// *******
//********* 
import java.util.*;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= n - i) {// remove the space.
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= i) {// incresing order number .
                System.out.print("*");

                j++;
            }
            j = 1;
            while (j <= i - 1)// decresing order of number.
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
