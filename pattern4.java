import java.util.Scanner;

public class pattern4 {
    public static void main(String[] atgs) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of row");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
