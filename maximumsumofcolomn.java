import java.util.Scanner;

public class maximumsumofcolomn {
    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of cols");
        int cols = sc.nextInt();
        int array[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter element at  " + i + "  row " + j + " column");
                int input = sc.nextInt();
                array[i][j] = input;
            }
        }
        return array;
    }

    public static void print(int array[][]) {
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void LargestSumOfColumn(int arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        int LargestSumOfColumn = Integer.MIN_VALUE;
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            if (sum > LargestSumOfColumn) {
                LargestSumOfColumn = sum;
            }
        }
        System.out.println(LargestSumOfColumn);
    }

    public static void main(String[] args) {
        int array[][] = takeInput();
        print(array);
        LargestSumOfColumn(array);
    }
}
