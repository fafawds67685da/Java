// test.java

import java.util.*;
public class test
{
	
	public void display()
	{	
		System.out.println("Parent class");
	}

}

// test2.java

public class test2 extends test
{
	public void display2()
	{
		display();
	}
	public static void main(String args[])
	{
		test2 ob = new test2();
		ob.display2();
	}
	
}
