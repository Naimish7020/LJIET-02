import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int m;
        while (i <= 10) {
            m = n * i;
            System.out.println(m);
            i = i + 1;
        }

    }
}
