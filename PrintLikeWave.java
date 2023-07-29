import java.util.Scanner;

public class PrintLikeWave {
    public static void wavePrint(int mat[][]) {
        int row = mat.length;
        if (row == 0) {
            System.out.println();
        } else {
            int col = mat[0].length;
            for (int j = 0; j < col; j++) {
                if (j % 2 == 0) {
                    for (int i = 0; i < row; i++) {
                        System.out.print(mat[i][j] + " ");
                    }
                } else {
                    for (int i = row - 1; i >= 0; i--) {
                        System.out.print(mat[i][j] + " ");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            int Array[][] = new int[row][col];
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    int input = sc.nextInt();
                    Array[j][k] = input;
                }
            }
            wavePrint(Array);
        }
    }
}
