package assessments;

public class Palindrome {

	public static void main(String[] args)
	{
		int n=18765;
		int original_number=n;
		int rem=0;
		int rev=0;
		while(n!=0)
		{
			rem=n%10;//to get the number out
			rev=rev*10+rem;
			n=n/10;// to reduce the number
		}
		System.out.println("The original_number:"+original_number);
		System.out.println("The reverse_number:"+rev);
		if(rev==original_number)
		{
			System.out.println("It is Palindrome");
		}
		else
		{
			System.out.println("It is not Palindrome");
		}
	}
}
