import java.util.*;

public class findTripletsum {
    public static int findTriplet(int Array[], int x) {
        int n = Array.length;
        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (Array[i] + Array[j] + Array[k] == x) {
                        count++;
                    }
                }
            }
        }
        return count;
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
            int findTriplet = findTriplet(Array, n3);
            System.out.println(findTriplet);
        }
    }
}
