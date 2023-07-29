import java.util.*;

public class breakKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 2;
        boolean d = false;
        while (i <= n - 1) {
            if (n % i == 0) {
                d = true;
                break;
            }
            i++;
        }
        if (d == true) {
            System.out.println("NOT A PRIME NUMBER");
        } else {
            System.out.println(" PRIME NUMBER");
        }

    }
}
