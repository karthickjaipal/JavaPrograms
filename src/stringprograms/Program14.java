package stringprograms;

public class Program14 {
	/*
	 * Remove the vowels in the given string
	 * String str="Hardships often prepare ordinary people from extraordinary destiny";
	 * The resultant string :  Hrdshps ftn prpr rdnry ppl frm xtrrdnry xtrrdnry dstny
	 */

	public static void main(String[] args)
	{

		String str="Hardships often prepare ordinary people from extraordinary destiny";
		str=str+ " ";
		String word="";
		String[] words= new String[250];
		int length=0;
		String res="";
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)!= ' ')
			{
				if(!(str.charAt(i) == 'a' || str.charAt(i)== 'e' || str.charAt(i)== 'i' || str.charAt(i)== 'o' || str.charAt(i)== 'u'))
				{
					word=word+str.charAt(i);

				}
			}
			else
			{
				words[length]=word;
				length++;
				word="";
			}
		}

		for(int k=0;k<length;k++)
		{
			res=res+" "+words[k];
		}

		System.out.println("The resultant string : "+ res);


	}

}
