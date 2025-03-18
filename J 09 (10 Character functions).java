import java.util.*;
class test
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
        // Initializing String and StringBuffer
        String str = "Hello World";


        System.out.println("1. isLetter: " + Character.isLetter(str.charAt(0)));
        System.out.println("2. isDigit: " + Character.isDigit(str.charAt(0)));
        System.out.println("3. isLetterOrDigit: " + Character.isLetterOrDigit(str.charAt(0)));
        System.out.println("4. isWhitespace: " + Character.isWhitespace(str.charAt(0)));
        System.out.println("5. isUpperCase: " + Character.isUpperCase(str.charAt(0)));
        System.out.println("6. isLowerCase: " + Character.isLowerCase(str.charAt(0)));
        System.out.println("7. isAlphabetic: " + Character.isAlphabetic(str.charAt(0)));
        System.out.println("8. isDefined: " + Character.isDefined(str.charAt(0)));
        System.out.println("9. isISOControl: " + Character.isISOControl(str.charAt(0)));
        System.out.println("10. isSpaceChar: " + Character.isSpaceChar(str.charAt(0)));
	}
}
