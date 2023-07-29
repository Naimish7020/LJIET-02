import java.util.Scanner;

public class sumofBoundryAnddiagonal {
    public static void totalsum(int mat[][]) {
        int sum = 0;
        int row = mat.length;
        if (row == 0) {
            System.out.println("0");
        } else {
            int col = mat[0].length;
            for (int i = 0; i < row; i = i + row - 1) {
                for (int j = 0; j < col; j++) {
                    sum = sum + mat[i][j];
                }
            }
            for (int j = 0; j < col; j = j + col - 1) {
                for (int i = 1; i < row - 1; i++) {
                    sum = sum + mat[i][j];
                }
            }
            for (int i = 1; i < row - 1; i++) {
                for (int j = 1; j < col - 1; j++) {
                    if (i == j) {
                        sum = sum + mat[i][j];
                    }
                }
            }
            if (row % 2 == 0) {
                int i = 1, j = col - 2;
                while (i < row - 1 && j > 0) {
                    sum = sum + mat[i][j];
                    i++;
                    j--;
                }
            } else {
                int i = 1, j = col - 2;
                while (i < row - 1 && j > 0) {
                    if (i != j) {
                        sum = sum + mat[i][j];
                        i++;
                        j--;
                    } else {
                        i++;
                        j--;
                    }

                }
            }
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int row = sc.nextInt();
            int Array[][] = new int[row][row];
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < row; k++) {
                    int input = sc.nextInt();
                    Array[j][k] = input;
                }
            }
            totalsum(Array);
        }
    }

}
