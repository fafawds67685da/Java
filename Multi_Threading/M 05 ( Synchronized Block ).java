class college {
	public void display(String n) {
		synchronized(this) {
			for(int i = 0; i < 10; i++) {
				System.out.println(n + " " + i);
			}
		}
	}
}

public class Sear extends Thread
{
	String n;
	college ob;
	Sear(college ci, String na)
	{
		this.ob = ci;
		n = na;
	}
	
	public void run()
	{
		ob.display(n);
	}
	
	public static void main(String args[])
	{
		college ci = new college();
		Sear ob = new Sear(ci, "Dev");
		Sear ob1 = new Sear(ci,"Goyal");
		ob.start();
		ob1.start();
	}
	
}
