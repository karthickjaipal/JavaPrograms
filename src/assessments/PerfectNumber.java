package assessments;

public class PerfectNumber {

	public static void main(String[] args)
	{
		//The sum of the perfect divisible of the given number should be equal to the given number 
		int sum=0;
		int n=6;
		for(int i=1;i<n;i++)
		{
			if(n%i==0) // if remainder is zero
			{
			sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("The number is perfect");
		}
		else
		{
			System.out.println("The number is not perfect");
		}
	}
}
