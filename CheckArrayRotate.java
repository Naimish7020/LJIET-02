import java.util.Scanner;

public class CheckArrayRotate {
    public static int arrayRotateCheck(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        for (int i = 1; i <= round; i++) {
            int size = sc.nextInt();
            int Array[] = new int[size];
            for (int j = 0; j < Array.length; j++) {
                Array[j] = sc.nextInt();
            }
            int number = arrayRotateCheck(Array);
            System.out.println(number);
        }
    }
}
