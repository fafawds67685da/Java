import java.util.*;
public class dd
{
	public static void main (String args[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("\t Enter the value of n \n");
		n = sc.nextInt();
	
		for(int i=0; i<n; i++)
		{
			for(int j = n-i; j>=0 ; j--)
			{
				System.out.print(" ");
			}
			System.out.print("1 ");

			for(int k=1;k<=i;k++)
			{
				System.out.print("2 ");
			}

			for(int l=1;l<=i;l++)
			{
				System.out.print("1 ");
			}
			
			System.out.println();
		}
	}
}
