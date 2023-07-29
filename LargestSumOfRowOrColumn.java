import java.util.Scanner;

public class LargestSumOfRowOrColumn {
    public static void findLargest(int mat[][]) {
        int rows = mat.length;
        int cols = mat[0].length;
        int LargestSumOfColumn = Integer.MIN_VALUE;
        int LargestSumOfRow = Integer.MIN_VALUE;
        if (rows == 0) {
            System.out.println("row " + "0" + "-2147483648");
        }
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + mat[i][j];
            }
            if (sum > LargestSumOfColumn) {
                LargestSumOfColumn = sum;
            }
        }
        for (int i = 0; i < rows; i++) {
            int sum1 = 0;
            for (int j = 0; j < rows; j++) {
                sum1 = sum1 + mat[i][j];
            }
            if (sum1 > LargestSumOfRow) {
                LargestSumOfRow = sum1;
            }
        }
        if (LargestSumOfColumn > LargestSumOfRow) {
            System.out.println(LargestSumOfColumn);
        } else {
            System.out.println(LargestSumOfRow);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            if (rows == 0 || cols == 0) {
                System.out.println(" row " + " 0 " + "-2147483648");
            } else {
                int Array[][] = new int[rows][cols];
                for (int j = 0; j < rows; j++) {
                    for (int k = 0; k < cols; k++) {
                        int input = sc.nextInt();
                        Array[i][j] = input;
                    }
                }
                findLargest(Array);
            }
        }
    }
}
