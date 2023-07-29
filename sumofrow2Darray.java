import java.util.Scanner;

public class sumofrow2Darray {
    public static void rowWiseSum(int[][] mat) {
        int row = mat.length;
        int cols = mat[0].length;
        while (row > 0 && cols > 0) {
            for (int i = 0; i < row; i++) {
                int sum = 0;
                for (int j = 0; j < cols; j++) {
                    sum = sum + mat[i][j];
                }
                System.out.print(sum + " ");
            }
        }
        System.out.println("0");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int k = 1; k <= n; k++) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int array[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    int input = sc.nextInt();
                    array[i][j] = input;
                }
            }
            rowWiseSum(array);
        }
    }
}
