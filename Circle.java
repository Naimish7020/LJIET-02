import java.util.Scanner;
public class Circle 
{
	final double PI=3.14;
	private int radious;
	private double area;
	private double circumference;
	public void  setData()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the radious=");
		radious=sc.nextInt();
	}
	public void getData()
	{
		System.out.println("area of this radious is a ="+ PI*radious*radious);
		System.out.println("circumference of this radious is a ="+2*PI*radious);	
	}

	public static void main(String[] args) 
	{
		Circle c1=new Circle();
		c1.setData();
		c1.getData();
		Circle c2=new Circle();
		c2.setData();
		c2.getData();
	}

}
