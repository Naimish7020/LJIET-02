import java.util.Scanner;

public class Arrangenumberinarray {
    public static void arrange(int[] arr, int n) {
        int ans = 0;
        int s = 0;
        if (n % 2 == 0) {
            s = n;
        } else {
            s = n - 1;
        }
        int n2 = n / 2;
        int n1 = n - n2;
        for (int i = 0; i < n1; i++) {
            ans = 2 * i + 1;
            arr[i] = ans;
        }
        for (int i = n1; i < n; i++) {
            arr[i] = s;
            s = s - 2;
        }
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int Array[] = new int[n1];
            arrange(Array, n1);
        }

    }
}
