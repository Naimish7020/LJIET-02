import java.util.Scanner;

public class FirstIndexOfNumber {
    public static int firstIndex(int input[], int x, int startindex) {
        if (startindex == input.length) {
            return -1;
        }
        if (input[startindex] == x) {
            return startindex;
        }

        int index = firstIndex(input, x, startindex + 1);
        return index;
    }

    public static int firstIndex(int input[], int x) {
        int index = firstIndex(input, x, 0);
        return index;
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
        int index = firstIndex(array, number);
        System.out.println(index);
    }
}
