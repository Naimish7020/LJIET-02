import java.util.Scanner;

public class FarenhetToCelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  tempreture in ferenhit");
        Float f = sc.nextFloat();
        Float cel = (5 * (f - 32)) / 9;
        System.out.println(cel);
    }

}
