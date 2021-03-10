package assessments;

public class AmstrongNumber {

	public static void main(String[] args)
	{
		int num=153;
		int temp=num;
		int c=0;
		/*
		 * The number is 153
		 * 1*1*1=1
		 * 5*5*5=125
		 * 3*3*3=27
		 * sum=153
		 * After Amstrong series: 153
		 */
		while(num!=0)
		{
			int rem=num%10;
			c=c+(rem*rem*rem);
			System.out.println(c);
			num=num/10;
		}
		if(c==temp)
		{
			System.out.println("The Amstrong number");
		}
		else
		{
			System.out.println("Not Amstrong Number");
		}
			
	    
	}
}
