import java.util.*;

public class ABC {
    public static int LinearSearch(int Array[], int x) {
        int count = 0;
        int A = 0;
        int n = Array.length;
        for (int i = 0; i < n; i++) {
            if (Array[i] == x) {
                count++;
                A = i;
                break;
            }
        }
        if (count == 1) {
            return A;
        } else {
            return -1;
        }

    }

    public static int Largest(int Array[]) {
        int n = Array.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        return max;
    }

    public static int sum(int Array[]) {
        int n = Array.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + Array[i];
        }
        return sum;
    }

    public static void print(int Array[]) {
        int n = Array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i]);
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
            print(Array);
            int sum = sum(Array);
            System.out.println("sum=" + sum);
            int largest = Largest(Array);
            System.out.println(largest);
            int n3 = sc.nextInt();
            int LinearSearch = LinearSearch(Array, n3);
            System.out.println("index=" + LinearSearch);
        }
    }
}
