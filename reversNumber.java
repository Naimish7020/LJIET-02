import java.util.*;

public class reversNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("0");
        } else {
            while (n > 0) {
                int n1 = n % 10;
                int n2 = n / 10;
                n = n2;
                if (n1 == 0) {
                    System.out.print("");
                } else {
                    System.out.print(n1);
                }
            }
        }
    }
}
