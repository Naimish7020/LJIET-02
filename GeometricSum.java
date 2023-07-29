import java.util.Scanner;

public class GeometricSum {
    public static double findGeometricSum(int k) {
        if (k == 0) {
            return 1;
        }
        double Dinominator = Math.pow(2, k);
        double sum = 1 / Dinominator;
        double ans = findGeometricSum(k - 1) + sum;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int power = sc.nextInt();
        double sum = findGeometricSum(power);
        System.out.println(sum);
    }
}
