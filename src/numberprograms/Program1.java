package numberprograms;

public class Program1 {
	
	/*
	 * Program to find palindrome or not
	 */

	public static void main(String[] args)
	{
		int n=1551;
		int temp=n;
		int rev=0;
		int rem;
		System.out.println("The given number :"+n);
		while(temp!=0)
		{
			rem=temp%10;
			rev= rev*10+ rem;
			temp=temp/10;
		}
        
		System.out.println("The reverse number :"+ rev);
		
		if(n == rev)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
	}

}
