import java.util.Scanner;

public class FindUnique1 {
    public static int FindUnique(int Array[]) {
        for (int i = 0; i < Array.length; i++) {
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[i] == Array[j]) {
                    Array[i] = 0;
                    Array[j] = 0;
                    break;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != 0) {
                ans = Array[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int j = 1; j <= number; j++) {
            int size = sc.nextInt();
            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }
            int UniqueNumber = FindUnique(array);
            System.out.println(UniqueNumber);
        }
    }
}
