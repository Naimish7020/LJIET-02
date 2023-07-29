import java.util.*;

public class Largestofthreenumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // if (A >= B && A >= C) {
        // System.out.println("A is largest");
        // } else {
        // if (B >= A && B >= C) {
        // System.out.println("B is largest");
        // } else {
        // System.out.println("C is largest");
        // }
        //
        // }
        if (A >= B && A >= C) {
            System.out.println("A ia max");
        } else if (B >= A && B >= C) {
            System.out.println("B is max");
        } else {
            System.out.println("C is max");
        }

    }

}
