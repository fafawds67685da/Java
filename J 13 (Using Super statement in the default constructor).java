import java.util.*;
public class test
{
	int a;
	test()
	{
		Super();
	}

	test(int x)
	{
		a=x;
	}


	public void display()
	{
		System.out.println(a+" ");
	}

	public static void main(String args[])
	{
		test ob1 = new test(10);
		test ob2 = new test();

		ob1.display();
		ob2.display();

	}
}
