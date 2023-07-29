
//13579
//35791
//57913
//79135
//91357
import java.util.*;

public class OddSqure {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) {
            int j = 1;
            int StartingNumber = 2 * (i) - 1;
            while (j <= n - i + 1) {
                System.out.print(StartingNumber);
                j++;
                StartingNumber += 2;
            }
            j = 1;
            StartingNumber = 1;
            while (j <= i - 1) {
                System.out.print(StartingNumber);
                j++;
                StartingNumber += 2;
            }
            System.out.println();
            i++;
        }

    }
}
