package stringprograms;

import java.util.HashSet;
import java.util.Set;

public class Program5 {
	
	/*
	 * Remove duplicate words from the sentence
	 * 
	 */

	public static void main(String [] args)
	{
		String givenString="Hardships often prepare prepare ordinary people for an  extraordinary extraordinary destiny";
		String word="";
		String[] words = new String[100];
		int length=0;
		Set set=new HashSet();
		String result="";
		givenString = givenString + " ";

		for(int i=0; i<givenString.length(); i++)
		{
			if(givenString.charAt(i)!= ' ')
			{
				word=word+givenString.charAt(i);
			}

			else
			{
				words[length] = word;
				length++;
				word="";
			}
		}

		for(int k=0; k<length; k++)
		{
			if(!set.add(words[k]))
			{
				result = result + " " + words[k];
			}
		}

System.out.println(result);

	}

}


