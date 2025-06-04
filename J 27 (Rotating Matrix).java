import java.util.*;
public class Sear
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int m;
		System.out.println("Enter the order of the matrix");
		m = sc.nextInt();
		if(!(m>2 && m<10))
		{
			System.out.println("Invalid matrix order");
			System.exit(0);
		}
		int a[][] = new int[m][m];
		
		System.out.println("Enter Array elements");
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Original matrix is:");
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		int corner = a[0][0] + a[0][m-1] + a[m-1][0] + a[m-1][m-1];
		
		for(int i =0;i<m;i++)
		{
			for(int j=i;j<m;j++)
			{
				int t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i]=t;
			}
		}
		
		for(int i =0;i<m;i++)
        {
            for(int j=0;j<m/2;j++)
            {
                int t = a[i][j];
                a[i][j]=a[i][m-1-j];
                a[i][m-1-j]=t;
            }
        }
		
		System.out.println("Matrix After Rotation is:");
		for(int i =0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Sum of the corner elements = "+corner);
	}
}
