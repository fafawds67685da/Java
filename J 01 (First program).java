public class dd
{
	public static void main (String args[])
	{
 		int s=0;
 		for(int i=0;i<args.length;i++)
  		{
  			s=s+Integer.parseInt(args[i]);
		}
		System.out.println(s);
	}
}
