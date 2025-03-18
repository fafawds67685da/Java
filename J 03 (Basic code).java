import java.util.*;
class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String name, dep;
		int age;
		int marks[] = new int[5];
		System.out.println("Enter the student's name");
		name = sc.nextLine();
		System.out.println("Enter the student's Department");
		dep = sc.nextLine();
		System.out.println("Enter the student's age");
		age = sc.nextInt();
		System.out.println("Enter the student's marks");
		for(int i =0;i<5;i++)
		{
			marks[i] = sc.nextInt();
		}
		double per=0.0;
		for(int i =0;i<5;i++)
		{
			per+=marks[i];
		}
		per/=5.0;
		System.out.println("Student's name is "+name);
		System.out.println("Student's Department is "+dep);
		System.out.println("Student's age is "+age);
		System.out.println("Student's percentage is "+per);


	}
}
