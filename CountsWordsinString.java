import java.util.Scanner;

public class CountsWordsinString {
    public static int countWords(String str) {
        int count = 0;
        if (str.length() == 0) {
            System.out.println();
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;
                }
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int countWords = countWords(str);
        System.out.println(countWords);
    }
}
