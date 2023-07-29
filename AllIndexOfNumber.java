import java.util.Scanner;

public class AllIndexOfNumber {
    public static int[] allIndexes(int input[], int x, int Array[], int startindex, int count) {
        if (startindex == input.length) {
            int newarray[] = new int[count];
            for (int i = 0; i < newarray.length; i++) {
                newarray[i] = Array[i];
            }
            return newarray;
        }
        if (x == input[startindex]) {
            Array[count] = startindex;
            count++;
        }
        int ans[] = allIndexes(input, x, Array, startindex + 1, count);
        return ans;
    }

    public static int[] allIndexes(int input[], int x) {
        int Array[] = new int[input.length];
        int ans[] = allIndexes(input, x, Array, 0, 0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            int input = sc.nextInt();
            array[i] = input;
        }
        int number = sc.nextInt();
        int Array[] = allIndexes(array, number);
        for (int j = 0; j < Array.length; j++) {
            System.out.print(Array[j] + " ");
        }
    }
}
