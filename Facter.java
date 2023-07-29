import java.util.*;

public class Facter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d = 2;
        while (d < num) {
            if (num % d == 0) {
                System.out.println(d + " ");
                d = d + 1;
            } else {
                d = d + 1;
            }
        }

    }
}
