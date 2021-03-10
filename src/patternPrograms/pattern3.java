package patternPrograms;

import java.util.HashSet;
import java.util.Set;

public class pattern3 {
	
	public static void main(String[] args)
	{
		String str="Hardships often prepare prepare ordinary people for an extraordinary extraordinary destiny";
		str=str+" ";
		String word="";
		String min , max;
		String[] words=new String[250];
		int length=0;
		Set set=new HashSet();
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				word=word+str.charAt(i);
			}
			else
			{
				words[length]=word;
				length++;
				word="";
			}
			
		}
		for(int k=0; k<length; k++)
		{
		System.out.print(words[k]+ " ");
		}
		
		System.out.println();
		for(int k=length-1; k>=0;k--)
		{
			System.out.print(words[k]+ " ");
			
		}
	
		System.out.println();
		
		min = max = words[0]; 
		for(int k=0; k<length; k++)
		{
			if(min.length() > words[k].length())
			{
				min=words[k];
			}
		}
		System.out.println("The smallest word in the sentence : "+ min);
		
		for(int k=0; k<length; k++)
		{
			if(max.length()<words[k].length())
			{
				max=words[k];
			}
		}
		System.out.println("The largest word in the sentence : "+ max);
		
		
		for(int k=0;k< length ; k++)
		{
			if(set.add(words[k]))
			{
				System.out.print(words[k]+ " ");
			}
		}
		
		System.out.println();
		
		for(int k=0;k< length ; k++)
		{
			if(!set.add(words[k]))
			{
				System.out.print(words[k]+ " ");
			}
		}
		
		
	}

}
