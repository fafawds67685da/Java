import java.io.*;
public class Test
{
	public static void main(String args[])throws IOException
	{
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("DEV\nJI\nGoyal");
		fw.close();
		
		FileReader fr = new FileReader("abc.txt");
		int k = fr.read();
		while(k!=-1)
		{
			System.out.print((char)k);
			k = fr.read();
		}
		fr.close();
	}
}
