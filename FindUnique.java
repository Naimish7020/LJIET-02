import java.util.*;

public class FindUnique {
    public static int FindUnique(int[] arr) {
        int n = arr.length;
        int Unique = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                if (count == 1) {
                    Unique = arr[i];
                }
            }
        }
        return UniqueP;
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
            int FindUnique = FindUnique(Array);
            System.out.println(FindUnique);
        }
    }
}
