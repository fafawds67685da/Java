import java.util.*;
class test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String n = "Hello World";
	
	System.out.println("01. "+n.length()); 
	System.out.println("02. "+n.charAt(1)); 
	System.out.println("03. "+n.substring(0,5)); 
	System.out.println("04. "+n.toUpperCase()); 
	System.out.println("05. "+n.toLowerCase()); 
	System.out.println("06. "+n.trim()); 
	System.out.println("07. "+n.replace('o','x')); 
	System.out.println("08. "+n.equals("Hello World")); 
	System.out.println("09. "+n.contains("World")); 
	System.out.println("10. "+n.indexOf("World")); 

	}
}
/*
01. 11
02. e
03. Hello
04. HELLO WORLD
05. hello world
06. Hello World
07. Hellx Wxrld
08. true
09. true
10. 6

*/
