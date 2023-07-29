import java.util.Scanner;

class Student {
    public String name;
    private int rollNumber;
    public int Age;

    public void Setrollnumber(int rn) {
        if (rn <= 0) {
            return;
        }
        rollNumber = rn;
    }

    public int Getrollnumber() {
        return rollNumber;
    }

}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "naimish";
        s1.Setrollnumber(132);
        s1.Age = 20;
        System.out.println(s1.name + " " + s1.Getrollnumber() + " " + s1.Age);
        Student s2 = new Student();
        s2.name = "jay";
        s2.Setrollnumber(12);
        s2.Age = 21;
        System.out.println(s2.name + " " + s2.Getrollnumber() + " " + s2.Age);
    }
}
