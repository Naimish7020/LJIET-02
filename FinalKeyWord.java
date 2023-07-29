
import java.util.Scanner;

class FinalKey {
    private final int rollno;
    public String name;

    public FinalKey(int rn, String n) {
        rollno = rn;
        name = n;
    }

    public void print() {
        System.out.print(name + " " + rollno);
    }
}

public class FinalKeyWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FinalKey f = new FinalKey(100, "naimish");
        f.print();
    }
}
