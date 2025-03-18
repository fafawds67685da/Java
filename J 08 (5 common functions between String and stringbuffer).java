import java.util.*;
class test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
        // Initializing String and StringBuffer
        String str = "Hello World";
        StringBuffer sb = new StringBuffer("Hello World");

        System.out.println("Original String: " + str);
        System.out.println("Original StringBuffer: " + sb);
        System.out.println("-------------------------------------------------");

        // 1. length()
        System.out.println("1. Length: " + str.length() + " | " + sb.length());

        // 2. charAt(index)
        System.out.println("2. charAt(4): " + str.charAt(4) + " | " + sb.charAt(4));

        // 3. indexOf(String s)
        System.out.println("3. indexOf('o'): " + str.indexOf('o') + " | " + sb.indexOf("o"));

        // 4. substring(start)
        System.out.println("4. substring(6): " + str.substring(6) + " | " + sb.substring(6));

        // 5. substring(start, end)
        System.out.println("5. substring(1, 5): " + str.substring(1, 5) + " | " + sb.substring(1, 5));
	}
}
