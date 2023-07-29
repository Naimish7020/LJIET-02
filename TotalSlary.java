import java.util.*;
import java.lang.Math;

public class TotalSlary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        String str = sc.next();
        char grade = str.charAt(0);
        int allow;
        if (grade == 65) {
            allow = 1700;
        } else if (grade == 66) {
            allow = 1500;
        } else {
            allow = 1300;
        }
        double TotalSalary = ((basic + (0.2 * basic) + (0.5 * basic) + allow) - (0.11 * basic));
        double p = Math.round(TotalSalary);
        int s = (int) (p);
        System.out.println(TotalSalary);
    }
}