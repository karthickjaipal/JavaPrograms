package stringprograms;

import java.util.HashSet;
import java.util.Set;

public class Program4 {

	/*
	 * Remove duplicates from a string
	 * 
	 */

	public static void main(String[] args) {
		String givenString ="malayalam";
		char[] ch = givenString.toCharArray();
		String res="";
		Set set=new HashSet();

		for(int i=0; i<ch.length; i++)
		{

			if(set.add(ch[i]))
			{
				res = res+ ch[i];
			}
		}

		System.out.println("The String before removing duplicates :"+givenString);
		System.out.println("The String after removing duplicates :"+res);

	}

}
