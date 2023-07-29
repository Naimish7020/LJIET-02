import java.util.Scanner;

public class Fectoriyal {
    public static int Fect(int n) {
        if (n == 0) {
            return 1;
        }
        int SmallAns = n * Fect(n - 1);
        return SmallAns;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = Fect(n);
        System.out.println(ans);
    }
}
