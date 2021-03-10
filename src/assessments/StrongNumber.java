package assessments;

public class StrongNumber {

	public static void main(String[] args)
	{
		/*
		 * 145
		 * 5!= 120 + 4!=24 + 1!=1 
		 * 5!+4!+1!=145
		 * 145==145 True
		 */
		int inputnum=534;
		int temp=inputnum;
		int c=0;
		while(temp!=0)
		{
		int rem=temp%10; //5
		int n=rem;
		int fact=1;
		for(int i=n;i>1;i--)
		{
			fact=fact*i;
		}
		System.out.println("The factorial "+ n +"is"+fact);
		
		c=c+fact;
		System.out.println(c);
		temp=temp/10;
		}
		
		if(c==inputnum)
		{
			System.out.println("It is Strong Number");
		}
		else
		{
			System.out.println("It is not Strong Number");
		}
		
		}
}
