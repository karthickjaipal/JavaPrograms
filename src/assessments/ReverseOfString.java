package assessments;

public class ReverseOfString {

	public static void main(String[] args)
	{
		String s="Education";
		String result="";
		for(int i=s.length()-1;i>=0;i--)
		{
			result=result+s.charAt(i);
		}
		System.out.println("The reverse of String: "+result);
	}
}
