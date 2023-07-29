import java.util.*;

public class PrintAllPair {
    public static void printAllPair(int Array[]) {
        int n = Array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.println(Array[i] + " " + Array[j]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            Array[i] = n1;
        }
        printAllPair(Array);
    }
}
