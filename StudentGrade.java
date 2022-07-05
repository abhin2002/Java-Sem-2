import java.util.Scanner;

public class StudentGrade {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the name : ");
		String name = sc.nextLine();
		System.out.println("Enter the Roll Number : ");
		int rollno = sc.nextInt();
		System.out.println("Enter the marks of Sub1, Sub2 and Sub3 : ");
		int mark1 = sc.nextInt();
		int mark2 = sc.nextInt();
		int mark3 = sc.nextInt();
		Student s = new Student(rollno, mark1, mark2, mark3, name);
		s.CalcGrade();
		
	}

}
