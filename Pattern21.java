//    1
//   232
//  34543
// 4567654
//567898765

import java.util.*;

public class Pattern21 {
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
            int StartingNumber = i;
            while (j <= i) {// incresing order number .
                System.out.print(StartingNumber);
                StartingNumber++;
                j++;
            }
            j = 1;
            int Startingvalue = 2 * (i - 1);
            while (j <= i - 1)// decresing order of number.
            {
                System.out.print(Startingvalue);
                j++;
                Startingvalue--;
            }
            System.out.println();
            i++;
        }
    }
}
