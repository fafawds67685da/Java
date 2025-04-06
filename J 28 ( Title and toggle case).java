import java.util.*;
class MyStringDemo 
{
	String str;
	MyStringDemo()
	{
		str="";
	}
	
	public void setString(String n)
	{
		str = n;
	}
	public void showString()
	{
		System.out.println("String is : "+str);
	}
	
	public void caseLower()
	{
		str = str.toLowerCase();
	}
	
	public void caseUpper()
	{
		str = str.toUpperCase();
	}
	
	public void caseTitle() 
	{
		str=" "+str;
		String n="";
		int l =str.length();
		for(int i =0;i<l;i++)
		{
			char ch = str.charAt(i);
			if(ch==' ')
			{
				n+=ch;
				ch=Character.toUpperCase(str.charAt(i+1));
				n+=ch;
				i+=1;
				
			}
			else
			{
				n+=ch;
			}
		}
		str=n;
		str = str.trim();
	}
	
	public void toggleCase() 
	{
		int l = str.length();
		String n="";
		for(int i =0;i<l;i++)
		{
			if(str.charAt(i)==' ')
			{
				n+=' ';
				continue;
			}
			char ch = str.charAt(i);
			int x = (int)ch;
			if(x>=65 && x<=90)
			{
				ch = Character.toLowerCase(ch);
			}
			else
			{
				ch= Character.toUpperCase(ch);
			}
			n+=ch;
		}
		str=n;
	}
}

public class UseString extends MyStringDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String n;
		System.out.println("Enter the string");
		n  = sc.nextLine();
		UseString ob = new UseString();
		ob.setString(n);
		
		int ch = 0;
		while(ch!=6)
		{
			System.out.println("Enter 1 for Lower case \n Enter 2 for Upper case \n Enter 3 for Title Case \n Enter 4 for Toggle Case \n Enter 5 to print the String \n Enter 6 to terminate");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				ob.caseLower();
				break;
			case 2:
				ob.caseUpper();
				break;
			case 3:
				ob.caseTitle();
				break;
			case 4:
				ob.toggleCase();
				break;
			case 5:
				ob.showString();
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("INVALID CHOICE");
				break;
			}
		}
		
	}
}
