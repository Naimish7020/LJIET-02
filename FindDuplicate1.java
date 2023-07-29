import java.util.Scanner;

public class FindDuplicate1 {
    public static int findDuplicate(int arr[]) {
        int duplicate = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = arr[i];
                }
            }
        }
        return duplicate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            int size = sc.nextInt();
            int Array[] = new int[size];
            for (int j = 0; j < size; j++) {
                Array[j] = sc.nextInt();
            }
            int duplicate = findDuplicate(Array);
            System.out.println(duplicate);
        }
    }
}
