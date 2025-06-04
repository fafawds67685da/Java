class student
{
	int roll = 20;
	int age = 20;
	String name = "Dev";
}
interface I
{
	public void printInfo();
}
interface I2
{
	public void show();
}
public class Test extends student implements I,I2
{
	public void printInfo()
	{
		System.out.println(roll+" "+name);
	}
	
	public static void main(String args[])
	{
		Test ob = new Test();
		ob.printInfo();
	}
}
