package stringprograms;

import java.util.HashSet;
import java.util.Set;

public class Program7 {
	
	/*
	 * 
	 * How do you find duplicate characters in a given string?
	 */

	public static void main(String[] args) {
		String givenString="pumpkinis";
		char[] ch= givenString.toCharArray();
		Set set= new HashSet();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
		if(!set.add(ch[i]))
		{
			System.out.println("character :"+ch[i]+" :: "+"index : "+i);
		}
		}

	}

}
