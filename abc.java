import java.util.Scanner;

public class abc {
    public static int binarySearch(int arr[], int x) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            Array[i] = n1;
        }
        int n2 = sc.nextInt();
        int index = binarySearch(Array, n2);
        System.out.println(index);
    }
}
