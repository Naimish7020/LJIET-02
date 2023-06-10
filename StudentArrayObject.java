package ArrayObjects;
import java.util.Scanner;
class studentDetails
{
	int rollNo;
	int marks;
	String name;
	String address;
	
	public studentDetails() {
	}
	public studentDetails(int rollNo, int marks, String name, String address) {
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "studentDetails [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + ", address=" + address
				+ "]";
	}
	
	
}
public class StudentArrayObject 
{
	public static void main(String[]args)
	{
		studentDetails[] s1=new studentDetails[5];
		@SuppressWarnings("resource")
		Scanner a=new Scanner(System.in);
		int i=0;
		do
		{
			s1[i]=new studentDetails(a.nextInt(),a.nextInt(),a.next(),a.next());
			i++;
		}
		while(i<5);
		for(int j=0;j<5;j++)
		{
			System.out.println(s1[j]);
		}
		
	}
}
