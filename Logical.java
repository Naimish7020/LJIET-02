import java.util.Scanner;

public class Logical {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        boolean AisGreater = (A > B) && (A > C);
        System.out.println((A > B) || (A > C));
        System.out.println(AisGreater);
        System.out.println(!(A >= B));

    }
}
