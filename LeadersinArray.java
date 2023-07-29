import java.util.Scanner;

public class LeadersinArray {
    public static void leaders(int[] input) {
        for (int i = 0; i < input.length; i++) {
            int count = 0;
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] < input[j]) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(input[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int input = sc.nextInt();
            Array[i] = input;
        }
        leaders(Array);
    }
}
