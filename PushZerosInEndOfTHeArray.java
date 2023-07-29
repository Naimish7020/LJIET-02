import java.util.Scanner;

public class PushZerosInEndOfTHeArray {
    public static int[] PushZerosInEndOfTHeArra(int Array[]) {
        int index = 0;
        int ans[] = new int[Array.length];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] != 0) {
                ans[index] = Array[i];
                index++;
            }
        }
        for (int i = index; i < ans.length; i++) {
            if (ans[i] == 1) {
                ans[i] = 0;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Array[] = new int[size];
        for (int i = 0; i < Array.length; i++) {
            int input = sc.nextInt();
            Array[i] = input;
        }
        int ans[] = PushZerosInEndOfTHeArra(Array);
        for (int i = 0; i < Array.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
