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
		ob.run(); //If you called ob.run() instead of ob.start(), 
		//it would run like a normal method call on the main thread—not as a new thread.
		
		
		//It calls ob.start(), which starts a new thread and calls the run() method in that new thread
		for(int i =0;i<10;i++)
		{
			System.out.println("Main thread is empty");
		}
	}
}
