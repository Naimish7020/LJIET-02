import java.util.Scanner;

public class LastIndexOfNumber {
    public static int lastIndex(int input[], int x, int startindex, int count) {
        if (startindex == input.length) {
            return -1;
        }
        if (input[startindex] == x) {
            count = startindex;
        }
        if (count != 0 && startindex == input.length - 1) {
            return count;
        }
        int index = lastIndex(input, x, startindex + 1, count);
        return index;
    }

    public static int lastIndex(int input[], int x) {
        int index = lastIndex(input, x, 0, 0);
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
        int index = lastIndex(array, number);
        System.out.println(index);
    }
}
