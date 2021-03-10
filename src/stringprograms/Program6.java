package stringprograms;

public class Program6 {
	
	/*
	 * How do you remove a given character from String?
	 * 
	 */

	public static void main(String[] args) {
		String givenString="Education";
		String res="";
		
		for (int i=0;i<givenString.length();i++)
		{
			if(givenString.charAt(i)!='i')
			{
			res=res+ givenString.charAt(i);	
			}
		}
		System.out.println("The resultant String :"+res);

	}

}
