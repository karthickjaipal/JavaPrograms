package stringprograms;

public class program3 {
	
	/*
	 * Number of times , a particular character exists in the string
	 * 
	 */

	public static void main(String[] args) {
		String givenString="Constitution";
		int count=0;
		for(int i=0; i<givenString.length(); i++)
		{
			char find=givenString.charAt(i);
			if(find=='i')
			{
				count++;
			}
		}
		System.out.println("The number of times 'i' in the given string :"+count);
		
		StringBuilder str=new StringBuilder(givenString);
		System.out.println(str.reverse());
		System.out.println(givenString.toLowerCase());
		System.out.println(givenString.toUpperCase());
		System.out.println(givenString.concat(givenString));
		
		
		

	}

}
