package stringprograms;

public class Program13 {

	/*
	 * Reverse the words in the given string
	 * String str="Hardships often prepare prepare ordinary people for an extraordinary extraordinary destiny";
	 * The output string : ynitsed yranidroartxe yranidroartxe na rof elpoep yranidro eraperp eraperp netfo spihsdraH
	 */

	public static void main(String[] args)
	{
		String str="Hardships often prepare prepare ordinary people for an extraordinary extraordinary destiny";
		String word="";
		String[] words= new String[250];
		str=" "+ str;
		int length=0;
		String res="";
		for(int i=str.length()-1 ; i>=0 ; i--)
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
			res=res+ " " + words[k];
		}
System.out.println("The output string :"+res);

	}

}
