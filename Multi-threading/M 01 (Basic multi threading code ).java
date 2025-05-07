import java.util.*;
public class Sear extends Thread
{
	public void run()
	{
		for(int i =0;i<10;i++)
		{
			System.out.println("Child thread "+i);
		}
	}
	
	public static void main(String args[])
	{
		Sear ob = new Sear();
		ob.start();
		for(int i =0;i<10;i++)
		{
			System.out.println("Main thread is empty");
		}
	}
}
