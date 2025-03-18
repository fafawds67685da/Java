import java.util.*;
public class test
{
	int a;
	test(int x)
	{
		a=x;
	}


	public void display()
	{
		System.out.println(a);
	}

	public static void main(String args[])
	{
		test ob[] = new test[5];
		int a=1;
		for(int i =0;i<5;i++)
		{
			ob[i] = new test(a);
			a+=1;
		}

		for(int i =0;i<5;i++)
		{

			ob[i].display();
		}
	}
}	
