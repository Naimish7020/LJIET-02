import java.util.Scanner;
import java.util.ArrayList;

public class RemoveCosecutiveElementOfArray {
    public static ArrayList<Integer> remove(int Array[]) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(Array[0]);
        for (int i = 1; i < Array.length; i++) {
            if (Array[i] != Array[i - 1]) {
                ans.add(Array[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        for (int i = 0; i < round; i++) {
            int size = sc.nextInt();
            int Array[] = new int[size];
            for (int j = 0; j < size; j++) {
                Array[j] = sc.nextInt();
            }
            ArrayList<Integer> ans = remove(Array);
            for (int k = 0; k < ans.size(); k++) {
                System.out.print(ans.get(k) + " ");
            }
        }
    }
}
