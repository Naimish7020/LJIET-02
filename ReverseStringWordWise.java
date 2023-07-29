import java.util.Scanner;

public class ReverseStringWordWise {
    public static String reverseWordWise(String input) {
        String reveString = "";
        int StartWord = 0;
        int i = 0;
        for (; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                int EndWord = i;
                reveString = input.substring(StartWord, EndWord) + reveString;
                StartWord = i + 1;
                reveString = " " + reveString;
            }
        }
        int EndWord = i;
        reveString = input.substring(StartWord, EndWord) + reveString;
        StartWord = i + 1;
        return reveString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseWordWise = reverseWordWise(str);
        System.out.print(reverseWordWise);
    }
}
