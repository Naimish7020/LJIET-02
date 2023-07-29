import java.util.Scanner;

public class CompresstheString {
    public static String getCompressedString(String str) {
        String ans = "";
        int Increment = 0;
        for (int i = 0; i < str.length(); i = i + Increment) {
            int count = 0;
            int startWord = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                    startWord++;
                } else {
                    break;
                }
            }
            Increment = startWord;
            if (count == 1) {
                ans = ans + str.charAt(i);
            } else {
                ans = ans + str.charAt(i) + count;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = getCompressedString(str);
        System.out.println(str1);
    }
}
