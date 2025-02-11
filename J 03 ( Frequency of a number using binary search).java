import java.util.*;
public class Sear 
{
	public int binary(int lb, int ub, int a[], int k)
	{
		int mid = (lb+ub+1)/2;
		while(lb<=ub)
		{
			if(a[mid]==k)
			{
				return mid;
			}
			else
			{
				if(k<a[mid])
				{
					ub = mid -1;
				}
				else
				{
					lb = mid +1;
				}
				mid = (lb+ub)/2;
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
		
		int k;
		System.out.println("\t Enter the number to be search \n");
		k = sc.nextInt();
		int res = ob.binary(0,n-1,a,k);
				if(res==-1)
			    {
					System.out.println("\t Number not present \n");
			    }
			    else
			    {
			        if(res ==0)
			        {
			            int res2 = ob.binary(res+1,n-1,a,k);
			            if(res2==-1)
			            {
			            	System.out.println(" Frequency :1");
			            }
			            else
			            {
			            	System.out.println("Frequency : "+(res2-res+1));
			            }
			        }
			        else if(res==n-1)
			        {
			            int res2 = ob.binary(0,n-2,a,k);
			            if(res2==-1)
			            {
			            	System.out.println(" Frequency :1");
			            }
			            else
			            {
			            	System.out.println("Frequency : "+(res-res2+1));
			            }
			        }
			        else{
			            int res2 = ob.binary(res+1,n-1,a,k);
			            int res3 = ob.binary(0,res-1,a,k);
			            if(res2==-1 && res3 ==-1)
			            {
			            	System.out.println(" Frequency :1");
			            }
			            else if(res2==-1 || res3 ==-1)
			            {
			                if(res2==-1)
			                {
			                	System.out.println("Frequency : "+(res-res3+1));
			                }
			                else
			                {
			                	System.out.println("Frequency : "+(res2-res+1));
			                }
			            }
			            else
			            {
			            	System.out.println("Frequency : "+(res2-res3+1));
			            }
			        }
			    }


		
	}
}
