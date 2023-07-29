import java.util.Scanner;

public class MinimumLengthWord {
    public static String minLengthWord(String input) {
        String ans = "";
        String ans1 = "";
        int maxlength = input.length();
        int Startword = 0;
        int i = 0;
        for (; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                int Endword = i - 1;
                if (maxlength > (Endword + 1 - Startword)) {
                    ans = input.substring(Startword, Endword + 1) + ans;
                    maxlength = Endword + 1 - Startword;
                    Startword = i + 1;
                } else {
                    Startword = i + 1;
                }
            }
        }
        int EndWord = i - 1;
        for (int j = EndWord; j >= Startword; j--) {
            if (maxlength > EndWord + 1 - Startword) {
                ans = input.substring(Startword, EndWord + 1) + ans;
                maxlength = EndWord + 1 - Startword;
                Startword = i + 1;
            }
        }
        ans1 = ans.substring(0, maxlength) + ans1;
        return ans1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ans = minLengthWord(str);
        System.out.println(ans);
    }
}
