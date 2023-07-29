
//A
//BC
//CDE
//DEFG
//EFGHI
import java.util.*;

public class Charpattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int startingchar;
        while (i <= n) {
            int j = 1;
            startingchar = 'A' + i - 1;
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
