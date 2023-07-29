import java.util.Scanner;

public class InsertionArray1 {
    public static void intersection(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    ans[index] = arr1[i];
                    index++;
                    arr1[i] = 0;
                    arr2[j] = 0;
                }
            }
        }
        for (int i = 0; i < ans.length - 1; i++) {
            for (int j = i + 1; j < ans.length; j++) {
                if (ans[i] > ans[j]) {
                    int temp = ans[j];
                    ans[j] = ans[i];
                    ans[i] = temp;
                }
            }
        }
        for (int j = 0; j < ans.length; j++) {
            if (ans[j] != 0) {
                System.out.print(ans[j] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            int size1 = sc.nextInt();
            int Array1[] = new int[size1];
            for (int j = 0; j < Array1.length; j++) {
                Array1[j] = sc.nextInt();
            }
            int size2 = sc.nextInt();
            int Array2[] = new int[size2];
            for (int j = 0; j < Array2.length; j++) {
                Array2[j] = sc.nextInt();
            }
            intersection(Array1, Array2);
        }
    }
}
