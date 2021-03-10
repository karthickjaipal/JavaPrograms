package stringprograms;

public class Program8 {

	/*
	 * Remove digits from the string and print the string without digits
	 * 
	 */

	public static void main(String[] args)
	{
		String givenString="Ed1uca5ti6on1";
		String res="";
		String digits="";
		char[] ch= null;

		for(int i=0; i<givenString.length(); i++)
		{
			if(givenString.charAt(i)>= '0' && givenString.charAt(i)<= '9')
			{
				digits=digits+ givenString.charAt(i);
				ch = digits.toCharArray();

			}
			else
			{
				res=res+givenString.charAt(i);
			}

		}
		System.out.println(ch);
		System.out.println("String after removing digits : " +res);
	}

}
