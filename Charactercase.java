import java.util.*;

public class Charactercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char c = st.charAt(0);
        if (c >= 65 && c <= 90) {
            System.out.println(1);
        } else if (c >= 97 && c <= 122) {
            System.out.println(0);
        } else {
            System.out.println(-1);
        }
    }
}
