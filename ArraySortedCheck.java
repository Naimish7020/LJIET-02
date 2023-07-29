import java.util.Scanner;

public class ArraySortedCheck {
    public static boolean Sortedornot(int array[], int startindex) {
        if (startindex == array.length - 1) {
            return true;
        }
        if (array[startindex] > array[startindex + 1]) {
            return false;
        }
        boolean ans = Sortedornot(array, startindex + 1);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Array[] = new int[size];
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            Array[i] = input;
        }
        boolean ans = Sortedornot(Array, 0);
        System.out.println(ans);
    }
}
