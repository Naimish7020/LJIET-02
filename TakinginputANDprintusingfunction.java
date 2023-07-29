import java.util.*;

public class TakinginputANDprintusingfunction {
    public static int Largest(int Array[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > max) {
                max = Array[i];
            }
        }
        return max;
    }

    public static int[] input() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            Array[i] = n1;
        }
        return Array;
    }

    public static void print(int Array[]) {
        int n = Array.length;
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int Array[] = input();
        print(Array);
        int Largest1 = Largest(Array);
        System.out.println("largest=" + Largest1);

    }
}
