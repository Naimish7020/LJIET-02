import java.util.Scanner;

public class sortingZeroandOne {
    public static void sortZeroesAndOne(int[] arr) {
        int n = arr.length;
        int temp = 0;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            if (arr[i] == 0 && arr[j] == 1) {
                i++;
                j--;
            } else if (arr[i] == 0 && arr[j] == 0) {
                i++;
            } else if (arr[i] == 1 && arr[j] == 1) {
                j--;
            } else {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                int n1 = sc.nextInt();
                int Array[] = new int[n1];
                for (int j = 0; j < n1; j++) {
                    int n2 = sc.nextInt();
                    Array[j] = n2;
                }
                sortZeroesAndOne(Array);
            }
        }
    }
}
