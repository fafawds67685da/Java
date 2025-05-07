import java.util.*;
class college
{
	synchronized public void show(String fac)
	{
		for(int i =0;i<10;i++)
		{
			System.out.println("faculty "+fac+" "+i);
		}
	}
}
public class Sear extends Thread
{
	college ci = new college();
	String ab;
	public void run()
	{
		ci.show(ab);
	}
	
	Sear(college ci, String xy)
	{
		this.ci = ci;
		this.ab=xy;
	}
	public static void main(String args[])
	{
		college ci = new college();
		Sear ob = new Sear(ci, "Dev");
		Sear ob2 = new Sear(ci, "Goyal");
		ob.start();
		ob2.start();
	}
}

//If two or more threads call show() on the same college object, only one of them can be inside the method at a time. The others must wait.
//Because the show() method is synchronized, even though both threads start, only one of them can execute show() at a time on the shared ci object.
