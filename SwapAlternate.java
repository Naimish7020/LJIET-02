import java.util.*;

public class SwapAlternate {
    public static void swapAlternate(int arr[]) {
        int temp = 0;
        int n = arr.length;
        for (int i = 0; i < n - 1; i = i + 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    public static void Print(int Array[]) {
        int n = Array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
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
            swapAlternate(Array);
            Print(Array);
        }
    }
}
