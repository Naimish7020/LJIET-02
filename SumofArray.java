import java.util.*;

public class SumofArray {
    public static int sum(int array[]) {
        int n = array.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int n1 = sc.nextInt();
            int Array[] = new int[n1];
            for (int j = 0; j < n1; j++) {
                int n2 = sc.nextInt();
                Array[j] = n2;
            }
            int sum = sum(Array);
            System.out.println("sum=" + sum);
        }

    }
}
