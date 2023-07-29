import java.util.Scanner;

public class PrintSpiral {
    public static void spiralPrint(int matrix[][]) {
        int row = matrix.length;
        if (row == 0) {
            System.out.println();
        } else {
            int col = matrix[0].length;
            int count = 0;
            int numberofelement = row * col;
            int sr = 0;
            int sc = 0;
            while (count < numberofelement) {
                for (int i = sc; count < numberofelement && i < col; i++) {
                    System.out.print(matrix[sr][i] + " ");
                    count++;
                }
                sr = sr + 1;
                for (int i = sr; count < numberofelement && i < row; i++) {
                    System.out.print(matrix[i][col - 1] + " ");
                    count++;
                }
                col = col - 1;
                for (int i = col - 1; count < numberofelement && i >= sc; i--) {
                    System.out.print(matrix[row - 1][i] + " ");
                    count++;
                }
                row = row - 1;
                for (int i = row - 1; count < numberofelement && i >= sr; i--) {
                    System.out.print(matrix[i][sc] + " ");
                    count++;
                }
                sc = sc + 1;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int cols = sc.nextInt();
            int Array[][] = new int[row][cols];
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < cols; k++) {
                    int input = sc.nextInt();
                    Array[j][k] = input;
                }
            }
            spiralPrint(Array);
        }
    }
}
