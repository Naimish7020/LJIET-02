import java.util.Scanner;

public class RemoveConsecutive {
    public static String removeConsecutiveDuplicates(String str) {
        String ans = "";
        int Increment = 0;
        for (int i = 0; i < str.length(); i = i + Increment) {
            int count = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                } else {
                    break;
                }
            }
            Increment = count;
            ans = ans + str.charAt(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = removeConsecutiveDuplicates(str);
        System.out.println(ans);
    }
}
