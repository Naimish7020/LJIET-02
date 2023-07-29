import java.util.Scanner;

public class CountZeros {
    public static int countZerosRect(int input, int count) {
        if (input == 0 && count == 0) {
            return 1;
        }
        if (input <= 9) {
            return count;
        }
        if (input % 10 == 0) {
            count++;
        }
        input = input / 10;
        int ans = countZerosRect(input, count);
        return ans;
    }

    public static int countZerosRect(int input) {
        int ans = countZerosRect(input, 0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int ans = countZerosRect(number);
        System.out.println(ans);
    }
}
