import java.util.*;
public class Sear implements Runnable
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
		Thread ot = new Thread(ob);
		ot.start();
		for(int i =0;i<10;i++)
		{
			System.out.println("Main thread is empty");
		}
	}
}
