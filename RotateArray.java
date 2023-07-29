import java.util.Scanner;

public class RotateArray {
    public static void rotate(int[] arr, int d) {
        int ans[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            ans[index] = arr[i];
            index++;
        }
        int index1 = 0;
        for (int i = d; i < ans.length; i++) {
            arr[index1] = ans[i];
            index1++;
        }
        for (int i = 0; i < d; i++) {
            arr[index1] = ans[i];
            index1++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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
            int d = sc.nextInt();
            rotate(Array1, d);
        }
    }
}
