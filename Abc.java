import java.util.Scanner;

public class Abc {
    public static int[] bubble(int Array[], int StartIndex) 
    {
        int round=Array.length-1;
        if(round==0)
        {
            return Array;
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int Array[] = new int[size];
        for (int i = 0; i < Array.length; i++) {
            int input = sc.nextInt();
            Array[i] = input;
        }
        int ans[] = bubble(Array, 0);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }

}
