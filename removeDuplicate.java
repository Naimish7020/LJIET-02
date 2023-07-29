import java.util.Scanner;

public class removeDuplicate {
    public static String removeAllOccurrencesOfChar(String str, char ch) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (ch != str.charAt(i)) {
                ans = ans + str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = sc.next();
        char remove = str1.charAt(0);
        String ans = removeAllOccurrencesOfChar(str, remove);
        System.out.println(ans);
    }
}
