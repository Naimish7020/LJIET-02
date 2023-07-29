import java.util.Scanner;

public class HighestOccuringCharacter {
    public static char highestOccuringChar(String str) {
        char ans = 'a';
        int highest = Integer.MIN_VALUE;
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > highest) {
                highest = count;
                ans = str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ans = highestOccuringChar(str);
        System.out.println(ans);
    }
}
