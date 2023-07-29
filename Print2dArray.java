import java.util.Scanner;

public class Print2dArray {
    public static void print2DArray(int input[][]) {
        int n = input.length;
        int m = input[0].length;
        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--) {
                for (int j = 0; j < m; j++) {
                    System.out.print(input[i][j] + " ");
                }
                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int array[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int input = sc.nextInt();
                array[i][j] = input;
            }
        }
        print2DArray(array);
    }
}
