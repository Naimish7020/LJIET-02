import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int power = sc.nextInt();
        int ans = num;
        if (power > 0) {
            while (power > 1) {
                ans = ans * num;
                power = power - 1;
            }
            System.out.println(ans);
        } else {
            System.out.println(1);
        }

    }
}