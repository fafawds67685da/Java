import java.util.*;
class test
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		 
		int s[][] = new int[4][];
		s[0] = new int[4];
		s[1] = new int[2];
		s[2] = new int[1];
		s[3] = new int[3];
		int a = 1;
		System.out.println("Enter the student's marks");
		for(int i =0;i<4;i++)
		{
			for(int j =0;j<s[i].length;j++)
			{
				a+=1;
				System.out.print(a+" ");
			}
			System.out.println();
		}
		  

	}
}
