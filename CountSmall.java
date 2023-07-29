import java.util.Scanner;

public class CountSmall {
    public static int[] countS(int n, int m, int[] a, int[] b) {
        int ans[] = new int[n];
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < m; j++) {
                if (a[i] >= b[j]) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            int Array1[] = new int[n1];
            for (int j = 0; j < n1; j++) {
                int n2 = sc.nextInt();
                Array1[j] = n2;
            }
            int n3 = sc.nextInt();
            int Array2[] = new int[n3];
            for (int k = 0; k < n3; k++) {
                int n4 = sc.nextInt();
                Array2[k] = n4;
            }
            int counts[] = countS(n1, n3, Array1, Array2);
            for (int c = 0; c < counts.length; c++) {
                System.out.print(counts[c] + " ");
            }
        }
    }
}
