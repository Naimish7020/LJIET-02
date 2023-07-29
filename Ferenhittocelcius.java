import java.util.*;

public class Ferenhittocelcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int E = sc.nextInt();
        int W = sc.nextInt();
        int C;
        while (S <= E) {
            C = (5 * (S - 32)) / 9;
            System.out.println(S + "" + C);
            S = S + W;
        }
    }

}
