import java.util.Scanner;

public class Pairsum1 {
    public static int pairSum(int arr[], int sum) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            int number = sc.nextInt();
            for (int i = 1; i <= number; i++) {
                int size = sc.nextInt();
                int Array[] = new int[size];
                for (int j = 0; j < Array.length; j++) {
                    Array[j] = sc.nextInt();
                }
                int sum = sc.nextInt();
                int numberofpair = pairSum(Array, sum);
                System.out.println(numberofpair);
            }
        }
    }
}
