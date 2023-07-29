import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int x, int StartIndex, int EndIndex) {
        if (StartIndex > EndIndex) {
            return -1;
        }
        int mid = (StartIndex + EndIndex) / 2;
        if (arr[mid] == x) {
            return mid;
        } else if (x < arr[mid]) {
            return binarySearch(arr, x, StartIndex, mid - 1);
        } else {
            return binarySearch(arr, x, mid + 1, EndIndex);
        }
    }

    public static int binarySearch(int[] arr, int x) {
        return binarySearch(arr, x, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Array[] = new int[size];
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            Array[i] = input;
        }
        int number = sc.nextInt();
        int index = binarySearch(Array, number);
        System.out.println(index);
    }
}
