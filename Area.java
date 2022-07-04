import java.util.Scanner;

public class Area {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Shape\n1.Rectangle\n2.Square\n3.Circle");
		int choice = sc.nextInt();
		if(choice == 1)
		{
			System.out.println("Enter the length and breadth : ");
			double length = sc.nextDouble();
			double breadth = sc.nextDouble();
			Rectangle rect = new Rectangle();
			rect.AreaCalc(length, breadth);
		}
		else if(choice == 2)
		{
			System.out.println("Enter the length : ");
			double length = sc.nextDouble();
			Square sqr = new Square();
			sqr.AreaCalc(length);
		}
		else if(choice == 3)
		{
			System.out.println("Enter the radius : ");
			double radius = sc.nextDouble();
			Circle crcl = new Circle();
			crcl.AreaCalc(radius);
		}
		else
			System.out.println("\nInvalid entry\n");
	}

}

class Rectangle
{
	void AreaCalc(double l, double b)
	
	{
		System.out.println("Area of reactangle is "+l*b);
	}
}

class Square
{
	void AreaCalc(double a)
	{
		System.out.println("Area of square is "+a*a);
	}
}

class Circle
{
	void AreaCalc(double r)
	{
		System.out.println("Area of circle is "+3.14*r*r);
	}
}