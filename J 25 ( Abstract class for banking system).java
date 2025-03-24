abstract class BankAccount
{
	public abstract void deposit(int ab);
	public abstract void withdraw(int ab);
}
public class test extends BankAccount
{
	public int bal,acc;
	test(int a, int y)
	{
		bal = a;
		acc = y;
	}

	public void deposit(int amt)
	{
		bal+=amt;
	}

	public void withdraw(int amt)
	{
		if(bal>=amt)
		{
			bal-=amt;
		}
		else
		{
			System.out.println("Insufficient Balance");
		}
	}

	public void display()
	{
		System.out.println("Balance is: "+bal);
		System.out.println("Account is: "+acc);
	}

	public static void main(String args[])
	{
		test ob = new test(100,456789);
		ob.deposit(200);
		ob.display();
		ob.withdraw(256);
		ob.display();
	}
}
