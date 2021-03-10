package stringprograms;

public class program2 {

	public static void main(String[] args)
	{
		String givenString="Education";
		String reverseString="";

		for(int i=givenString.length()-1; i>=0; i-- )
		{
			reverseString=reverseString+ givenString.charAt(i);
		}

		System.out.println("reverse String : "+ reverseString);

		if(reverseString.equals(givenString))
		{
			System.out.println("Palidrome");
		}
		else
		{
			System.out.println("Not Palidrome");
		}
	}



}
