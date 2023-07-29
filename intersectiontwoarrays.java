import java.util.Scanner;

public class intersectiontwoarrays {
    public static void intersections(int arr1[], int arr2[]) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = 0;
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 1; j++) {
                int n1 = sc.nextInt();
                int Array1[] = new int[n1];
                for (int k = 0; k < n1; k++) {
                    int n2 = sc.nextInt();
                    Array1[k] = n2;
                }
                int n3 = sc.nextInt();
                int Array2[] = new int[n3];
                for (int k = 0; k < n3; k++) {
                    int n4 = sc.nextInt();
                    Array2[k] = n4;
                }
                intersections(Array1, Array2);
            }
        }
    }
}
