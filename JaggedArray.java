import java.util.Scanner;

public class JaggedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        int Array[][] = new int[rows][];
        for (int i = 0; i < rows; i++) {
            Array[i] = new int[i + 2];
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.println("enter element at " + i + " rows " + j + " cols");
                int input = sc.nextInt();
                Array[i][j] = input;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < Array[i].length; j++) {
                System.out.print(Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
