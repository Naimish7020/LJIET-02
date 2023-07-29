import java.util.Scanner;

public class mergeSort {
    public static int[] merge(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                ans[k] = arr2[j];
                k++;
                j++;
            } else if (arr2[j] > arr1[i]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else if (arr2[j] == arr1[i]) {
                ans[k] = arr1[i];
                i++;
                k++;
            }
        }
        while (i < arr1.length) {
            ans[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            ans[k] = arr2[j];
            k++;
            j++;
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
            for (int j = 0; j < n3; j++) {
                int n4 = sc.nextInt();
                Array2[j] = n4;
            }
            int merge[] = merge(Array1, Array2);
            for (int k = 0; k < merge.length; k++) {
                System.out.print(merge[k] + " ");
            }
        }
    }
}
