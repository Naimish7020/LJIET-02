import java.util.Scanner;

public class CheckPermutation {
    public static boolean isPermutation(String str1, String str2) {
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                int count1 = 0;
                int count2 = 0;
                int count = 0;
                for (int j = 0; j < str2.length(); j++) {
                    if (str1.charAt(i) == str2.charAt(j)) {
                        count++;
                        for (int k = 0; k < str1.length(); k++) {
                            if (str1.charAt(k) == str1.charAt(i)) {
                                count1++;
                            }
                        }
                        for (int c = 0; c < str2.length(); c++) {

                            if (str2.charAt(c) == str2.charAt(j)) {
                                count2++;
                            }
                        }
                        if (count1 == count2) {
                        } else {
                            return false;
                        }
                    }
                }
                if (count == 0) 
                {
                    return false;
                }
            }
            return true;
        } else 
        {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean ans = isPermutation(str1, str2);
        System.out.println(ans);
    }
}