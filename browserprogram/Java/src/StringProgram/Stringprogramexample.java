package StringProgram;

public class Stringprogramexample {
	public static void main(String[]args) {
		String string1="live Tech";
		System.out.println("The value of the string 1 is:"+string1);
		String string2="live tech";
		System.out.println("The value of the string 1 is:"+string2);
		 
		if(string1.equals(string2))
		{
			System.out.println("both the string values string1 and string2 are equal");
		}
		else
		{
			System.out.println("both the string values string1 and string2 are not equal");
		}
		System.out.println("############");
		String string3="Testing Tools";
		String string4="Testing Tools";
		if(string3.equals(string4))
		{
			System.out.println("both the string values string3 and string4 are equal");
		}
		else
		{
			System.out.println("both the string values string3 and string4 are not equal");
		}
		System.out.println("$$$$$$$$");
		String string5="Testing Tools";
		String string6="Testing tools";
		if(string5.equalsIgnoreCase(string6))
		{
			System.out.println("both the string values string5 and string6 are equal");
		}
		else
		{
			System.out.println("both the string values string5 and string7 are not equal");
		}
		System.out.println("%%%%%%%%%");
		String string7="Selenium";
		String string7uppercasevalue =string7.toUpperCase();
		System.out.println("The value of variable after converting to uppercase letter is:"+string7uppercasevalue);
		
		System.out.println("@@@@@@@@@@");
		String string8="Selenium";
		String string8lowercasevalue =string8.toLowerCase();
		System.out.println("The value of variable after converting to lowercase letter is:"+string8lowercasevalue);
		System.out.println("!!!!!!!!!!"); 
		
		String string9="webDriver";
		int string9length =string9.length(); 
		System.out.println("The number of characters in the variable 9 are:"+ string9length);
		System.out.println("***Finding the character at an index of the string value***");
		System.out.println(string9.charAt(3));
		int string9Asciivalue=string9.charAt(4);
		System.out.println("The ASCII character value of the string variable string9 at index 4 :"+string9Asciivalue);
	
	String string10="Livetech";
	String string11="tech";
	if(string10.contains(string11))
	{
System.out.println("String existing");
	}
	else
	{
		System.out.println("String not found");
		
	}

	}
}



