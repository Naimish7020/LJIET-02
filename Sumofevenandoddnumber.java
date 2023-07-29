import java.util.*;

public class Sumofevenandoddnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int oddsum = 0;
        int digit;
        int evensum = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;
            if (digit % 2 == 0) {
                evensum = evensum + digit;
            } else {
                oddsum = oddsum + digit;
            }
        }
        System.out.println(evensum + " " + oddsum);
    }
}
