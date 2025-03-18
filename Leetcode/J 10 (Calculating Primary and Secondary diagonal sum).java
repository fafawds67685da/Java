import java.util.Scanner;

public class Sear 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int m,n;
        System.out.println("Enter the matrix dimension");
        n = sc.nextInt();
        m = sc.nextInt();
        if(m!=n)
        {
        	System.out.println("Invalid the matrix dimension");
        	System.exit(0);
        }
        int a[][] = new int [m][n];
        System.out.println("Enter the matrix elements");
        for(int i =0;i<m;i++)
        {
        	for(int j =0;j<n;j++)
        	{
        		a[i][j] = sc.nextInt();
        	}
        	
        }
        
        System.out.println("Original Matrix is :");
        for(int i =0;i<m;i++)
        {
        	for(int j =0;j<n;j++)
        	{
        		System.out.print(a[i][j]+" ");
        	}
        	System.out.println();
        }
        int p=0,s=0;
        for(int i =0;i<n;i++)
        {
        	p+=a[i][i];
        	s+=a[i][n-i-1];
        }
        System.out.println("Sum of Primary Diagonal is   :"+p);
        System.out.println("Sum of Secondary Diagonal is :"+s);
        
    }
}
