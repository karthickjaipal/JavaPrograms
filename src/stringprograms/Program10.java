package stringprograms;

public class Program10 {
	
	/*
	 * Number of times , given character exists in the string
	 * 
	 */
	
	public static void main(String[] args)
	{
		String givenString="Assistance";
		int count=0;
		for(int i=0; i<givenString.length(); i++)
		{
			if(givenString.charAt(i)== 's')
			{
				count++;
			}
		}
		System.out.println("The number of times character exists :" + count);
		
	}

}
