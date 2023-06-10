package ArrayObjects;
import java.util.Scanner;
class employee
{
	int empId;
	String empName;
	int empSalary;
	
	public employee() {
	
	}

	public employee(int empId, String empName, int empSalary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}
	
}
public class employeeDemo 
{
	public static void main(String []args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		employee[] e1=new employee[5];
		int count=0;
		for(int i=0;i<5;i++)
		{
			e1[i]=new employee(sc.nextInt(),sc.next(),sc.nextInt());
			count++;
		}
		for(int j=0;j<e1.length;j++)
		{
			System.out.println(e1[j]);
		}
		System.out.println(count);
		
	}
}
