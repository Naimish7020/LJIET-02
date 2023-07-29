import java.util.Scanner;

public class CheckNumberInArray {
    public static boolean checkNumber(int input[], int x) {
        if (input.length <= 1) {
            if (x == input[0]) {
                return true;
            } else {
                return false;
            }
        }
        int smallarray[] = new int[input.length - 1];
        for (int i = 1; i < input.length; i++) {
            smallarray[i - 1] = input[i];
        }
        boolean ans = checkNumber(smallarray, x);
        if (x == input[0]) {
            return true;
        }
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
        int number = sc.nextInt();
        boolean ans = checkNumber(Array, number);
        System.out.println(ans);
    }
}
