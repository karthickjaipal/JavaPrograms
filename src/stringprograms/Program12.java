package stringprograms;

public class Program12 {
	
	/*
	 * Reverse the words in the given string
	 * String str="Hardships often prepare prepare ordinary people for an extraordinary extraordinary destiny";
	 * Output string:  destiny extraordinary extraordinary an for people ordinary prepare prepare often Hardships
	 */
	
	public static void main(String[] args)
	{
		/*
		 * logic one
		 */
	/*String str="Hardships often prepare prepare ordinary people for an  extraordinary extraordinary destiny";
	String[] strarray=str.split(" ");
	String revWords="";
	System.out.println(str);
	for(int i=strarray.length-1 ; i>=0 ; i--)
	{
		revWords= revWords + strarray[i]+ " ";
	}
	System.out.println("the words in reverse :" + revWords);*/
		
		/*
		 * logic two
		 */
	String str="Hardships often prepare prepare ordinary people for an extraordinary extraordinary destiny";
	String word="";
	int length=0;
	String strnew="";
	String[] words= new String[250];
	str= str + " ";
	for(int i=0; i<str.length(); i++)
	{
		if(str.charAt(i)!= ' ')
		{
			word= word+ str.charAt(i);
		}
		else
		{
			words[length]= word;
			length++;
			word="";
		}
	}
	 for (int k=length-1; k>=0; k--)
	 {
		 strnew = strnew + " " + words[k];
	 }
	 
	 System.out.println("the output string: "+ strnew);
	
	
	}
	

}
