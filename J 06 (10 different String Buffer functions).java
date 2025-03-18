import java.util.*;
class test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	String n = "Hello";
	StringBuffer sb = new StringBuffer(n);
	
	System.out.println("01. "+sb.append("World")); 
	System.out.println("02. "+sb.insert(6, "Java")); 
	System.out.println("03. "+sb.replace(6,10,"Kotlin")); 
	System.out.println("04. "+sb.delete(6,12)); 
	System.out.println("05. "+sb.reverse()); 
	System.out.println("06. "+sb.length()); 
	System.out.println("07. "+sb.charAt(0)); 
	sb.setCharAt(0, 'M'); 
	System.out.println("08. " + sb); 
	System.out.println("09. "+sb.substring(0,5)); 
	System.out.println("10. "+sb.capacity()); 

	}
}

/*

01. HelloWorld
02. HelloWJavaorld
03. HelloWKotlinorld
04. HelloWorld
05. dlroWolleH
06. 10
07. d
08. MlroWolleH
09. MlroW
10. 21

*/
