import java.util.Scanner;

class Employee {
    int EmpId;
    String EmpName;
    String EmpAddress;
    int TA;
    int basicSalary;
    int DA;

    public void setdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your Empid");
        this.EmpId = sc.nextInt();
        System.out.println("enter your Empname");
        this.EmpName = sc.nextLine();
        System.out.println("enter your EmpAddress");
        this.EmpAddress = sc.nextLine();
        System.out.println("enter your basicsalary");
        this.basicSalary = sc.nextInt();
        System.out.println("enter your TA");
        this.TA = sc.nextInt();
        System.out.println("enter your DA");
        this.DA = sc.nextInt();
    }
}

class EmployeeMain {
    public static void main(String[] args) {

    }
}
