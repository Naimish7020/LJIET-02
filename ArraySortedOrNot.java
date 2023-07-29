
import java.util.Scanner;

public class ArraySortedOrNot {
    public static boolean SortedOrNot(int array[]) {
        if (array.length <= 1) {
            return true;
        }
        int smallarray[] = new int[array.length - 1];
        for (int i = 1; i < array.length; i++) {
            smallarray[i - 1] = array[i];
        }
        boolean smallans = SortedOrNot(smallarray);
        if (!smallans) {
            return false;
        }
        if (array[0] <= array[1]) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Array[] = new int[size];
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            Array[i] = input;
        }
        boolean Ans = SortedOrNot(Array);
        System.out.println(Ans);
    }
}
