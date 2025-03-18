import java.util.*;
import java.util.Arrays;
public class Sear 
{
	public int binary(int n, int a[], int k)
	{
		for(int i=0;i<n;i++)
		{
			if(a[i]==k)
			{
				return i;
			}
		}
		return -1;
	}
	public static void main(String args[])
	{
		Sear ob = new Sear();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("\t Enter the size of the array \n");
		n = sc.nextInt();
		int a[]	= new int[n];
		System.out.println("\t Enter array elements \n");
		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		int z=0;
		System.out.println("\t Enter the key \n");
		int k = sc.nextInt();
		for(int i = 0;i<n;i++)
		{
				int res = ob.binary(n,a,a[i]+k);
				
					if(res!=-1)
					{
						z+=1;
					}
				
			
		}
		System.out.println("\t Number of pairs : \n"+z);
	}
}
