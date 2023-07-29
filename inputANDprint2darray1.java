import java.util.Scanner;//using function.

public class inputANDprint2darray1 {
    public static int[][] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of columns");
        int cols = sc.nextInt();
        int array[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.println("enter element at" + i + " row " + j + "  cols ");
                int input = sc.nextInt();
                array[i][j] = input;
            }
        }
        return array;
    }

    public static void printArray(int array[][]) {
        int rows = array.length;
        int cols = array[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int Array[][] = takeInput();
        printArray(Array);
    }
}
