import java.util.Scanner;

public class Simpleintrest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int t = sc.nextInt();
        float r = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println(si);

    }

}
