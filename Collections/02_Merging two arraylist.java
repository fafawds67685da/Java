import java.util.*;
public class Test
{
	public ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b)
	{
		ArrayList<Integer> res = new ArrayList<>();
		int p = a.size(),q=b.size();
		int i=0,j=0,k=0;
		while(i<p && j<q)
		{
			if(a.get(i)<b.get(j))
			{
				res.add(a.get(i++));
			}
			else
			{
				res.add(b.get(j++));
			}
		}
		while(i<p)
		{
			res.add(a.get(i++));
		}
		while(j<q)
		{
			res.add(b.get(j++));
		}
		return res;
	}
	
	public static void main(String args[])
	{
		Test ob = new Test();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
		int m,n;
		System.out.println("Enter the size of both the lists");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Enter the elements for the first list");
		for(int i =0;i<n;i++)
		{
			a.add(sc.nextInt());
		}
		
		System.out.println("Enter the elements for the second list");
		
		for(int i =0;i<m;i++)
		{
			b.add(sc.nextInt());
		}
		c = ob.merge(a, b);
		System.out.println("Elements of the megrd list is");
		for(int i:c)
		{
			System.out.print(i+" ");
		}
		
		System.out.println("Elements of the megrd list is "+c);
	}
}
