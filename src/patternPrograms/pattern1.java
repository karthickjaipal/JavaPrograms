package patternPrograms;

import java.util.HashSet;
import java.util.Set;

public class pattern1 {
	
	public static void main(String[] args)
	{
		String str="Hardships often prepare prepare ordinary people for an extraordinary extraordinary destiny";
		str=str+" ";
		String word="";
		int length=0;
		String max="";
		String min="";
		String[] words=new String[300];
		Set set=new HashSet();
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!= ' ')
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
		
		for(int k=0; k<length ; k++)
		{
			
			System.out.print(words[k]+ " ");
		}
		
		System.out.println();
		
		max= min=words[0];
		
		for(int k=0; k<length ; k++)
		{
			if(min.length()> words[k].length())
			{
				min=words[k];
			}
		}
		System.out.println("the min string :"+min);
		
		for(int k=0; k<length ; k++)
		{
			if(max.length()< words[k].length())
			{
				max=words[k];
			}
		}
		System.out.println("the max string :"+max);
		
		System.out.println("String after removing duplicates: ");
		for(int k=0; k<length ; k++)
		{
			if(set.add(words[k]))
			{
				System.out.print(words[k]+" ");
			}
		}
		System.out.println();
		System.out.println("the reverse words: ");
		for(int k=length-1; k>=0 ; k--)
		{
			System.out.print(words[k]+" ");
		}
		
		
	}

}
