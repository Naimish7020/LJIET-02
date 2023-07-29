import java.util.Scanner;

public class ReverseEachWord {
    public static String reverseEachWord(String str) {
        String reverseString = "";
        int StartWord = 0;
        int i = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                int EndWord = i - 1;
                for (int j = EndWord; j >= StartWord; j--) {
                    reverseString = reverseString + str.charAt(j);
                }
                StartWord = i + 1;
                reverseString = reverseString + " ";
            }
        }
        int EndWord = i - 1;
        for (int j = EndWord; j >= StartWord; j--) {
            reverseString = reverseString + str.charAt(j);
        }
        return reverseString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverseEachWord = reverseEachWord(str);
        System.out.print(reverseEachWord);
    }
}
