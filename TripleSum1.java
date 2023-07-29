import java.util.Scanner;

public class TripleSum1 {
    public static int tripleSum(int arr[], int num) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == num) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            int size = sc.nextInt();
            int Array[] = new int[size];
            for (int j = 0; j < Array.length; j++) {
                Array[j] = sc.nextInt();
            }
            int sum = sc.nextInt();
            int count = tripleSum(Array, sum);
            System.out.println(count);
        }
    }
}
