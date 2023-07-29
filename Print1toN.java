import java.util.*;

public class Print1toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i = i + 1;
        }
    }
}
