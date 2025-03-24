import java.util.*;
public class test
{
	final int a;
	test()
	{
		a=0;
	}

	test(int x)
	{
		a=x;
	}

	public void display()
	{
		System.out.println(a+" ");
	}

	public static void main(String args[])
	{
		String arr[] = {"DEV","ABC","DEF"};
		for(int i =0;i<3-1;i++)
		{
			for(int j = 0;j<3-1-i;j++)
			{
				if(arr[j+1].compareTo(arr[j])<0)
				{
					String n = arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=n;
				}
			}	
		}
		
		for(int i =0;i<3;i++)
		{
			System.out.println(arr[i]+" ");
		}		
		
	}
}
