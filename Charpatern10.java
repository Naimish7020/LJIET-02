
//ABCDE
//BCDEF
//CDEFG
//DEFGH
//EFGHI
import java.util.*;

public class Charpatern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int startingchar;
        while (i <= n) {
            int j = 1;
            startingchar = 'A' + i - 1;
            while (j <= n) {
                System.out.print((char) (startingchar));
                startingchar++;
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
