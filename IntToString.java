import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("ONE");
        } else if (n == 2) {
            System.out.println("TWO");
        } else if (n == 3) {
            System.out.println("Three");
        } else {
            System.out.println("enter valid number");
        }
    }
}
