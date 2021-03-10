package numberprograms;

public class program2 {

	public static void main(String[] args) {
		int n=95959;
		//case 1:
		int temp=n;
		int find=4;
		int rem;
		int count=0;
		/*
		 * Number of times , particular digit present
		 */
		while(temp!=0)
		{
			rem=temp%10;
			if(rem == 4)
			{
				count++;
			}
			temp=temp/10;
		}
		System.out.println("The number of times "+find+ " present is: "+count);
	
	
	//case 2:
	int num=95;
	int counts=0;
	while(n!=0)
	{
	rem=n%100;
	if(rem == num)
	{
		counts++;
	}
	n=n/10;
	}
	System.out.println("The number of times "+num+ " present is: "+counts);
	
	
	}
}
