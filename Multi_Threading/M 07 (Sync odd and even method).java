import java.util.*;
class number
{
	synchronized public void print()
	{
		for(int i =0;i<=20;i+=2)
		{
			System.out.println(i);
		}
	}
	synchronized public void print1()
	{
		for(int i =1;i<=20;i+=2)
		{
			System.out.println(i);
		}
	}
}

public class Test extends Thread
{
	number ob;
	int a;
	Test(number ob1, int b)
	{
		this.ob = ob1;
		this.a = b;
	}
	public void run()
	{
		if(a==0)
		{
			ob.print();
		}
		else
		{
			ob.print1();
		}
		
	}
	
	public static void main(String args[])
	{
		number nu = new number();
		Test ob = new Test(nu, 0);
		Test ob1 = new Test(nu, 1);
		ob.start();
		ob1.start();
		
	}
}
