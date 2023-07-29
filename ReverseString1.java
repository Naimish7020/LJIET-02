import java.util.Scanner;

public class ReverseString1 {
    public static String reverseString(String str) {
        String ReveString = "";
        for (int i = 0; i < str.length(); i++) {
            ReveString = str.charAt(i) + ReveString;
        }
        return ReveString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string:");
        String str = sc.nextLine();
        String reverseString = reverseString(str);
        System.out.println(reverseString);
    }
}
