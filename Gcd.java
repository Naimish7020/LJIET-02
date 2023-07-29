import java.util.Scanner;

public class Gcd {
    public static int Gcd(int n1, int n2) {
        int gcd = 1;
        int smallest = Math.min(n1, n2);
        for (int i = 2; i <= smallest; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int gcd = Gcd(n1, n2);
        System.out.println(gcd);
    }
}
