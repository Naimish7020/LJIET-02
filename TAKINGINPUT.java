import java.util.*;

public class TAKINGINPUT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Array[] = new int[n];
        for (int i = 0; i < n; i++) {
            int n1 = sc.nextInt();
            Array[i] = n1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
