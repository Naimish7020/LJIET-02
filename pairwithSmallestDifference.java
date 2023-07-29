import java.util.Scanner;

public class pairwithSmallestDifference {
    public static int smallestDifferencePair(int arr1[], int n, int arr2[], int m) {
        int smallestDifference = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int ans = 0;
                if (arr1[i] >= arr2[j]) {
                    ans = arr1[i] - arr2[j];
                } else {
                    ans = arr2[j] - arr1[i];
                }
                if (smallestDifference > ans) {
                    smallestDifference = ans;
                }
            }
        }
        return smallestDifference;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            int Array1[] = new int[n1];
            for (int j = 0; j < n1; j++) {
                int n3 = sc.nextInt();
                Array1[j] = n3;
            }
            int Array2[] = new int[n2];
            for (int k = 0; k < n2; k++) {
                int n4 = sc.nextInt();
                Array2[k] = n4;
            }
            int smallestDifferencePair = smallestDifferencePair(Array1, n1, Array2, n2);
            System.out.print(smallestDifferencePair);
        }
    }
}
