import java.util.*;

public class LenearSearch {
    public static int linearSearch(int arr[], int x) {
        int count = 0;
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                count++;
                a = i;
                break;
            }
        }
        if (count == 1) {
            return a;
        } else {
            return -1;
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
            int n3 = sc.nextInt();
            int LinearSearch = linearSearch(Array, n3);
            System.out.println(LinearSearch);
        }
    }
}
