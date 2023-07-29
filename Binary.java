import java.util.Scanner;

public class Binary {
    public static int binarySearch(int arr[], int x) {
        int Start = 0;
        int End = arr.length - 1;
        while (Start <= End) {
            int mid = (Start + End) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                Start = mid + 1;
            } else if (x < arr[mid]) {
                End = mid - 1;
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
        int binarySearch = binarySearch(Array, n2);
        System.out.println(binarySearch);
    }
}
