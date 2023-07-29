import java.util.Scanner;

public class PalinDromeOrNot {
    public static boolean isPalindrome(String str) {
        String ReveString = "";
        for (int i = 0; i < str.length(); i++) {
            ReveString = str.charAt(i) + ReveString;
        }
        if (str.equals(ReveString)) {
            return true;
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean palindromeornot = isPalindrome(str);
        System.out.println(palindromeornot);
    }
}
