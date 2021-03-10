package numberprograms;

public class Program3 {

	public static void main(String[] args) {
		int n=100;
		System.out.println("The numbers are:");
		for(int i=0; i<=n ; i++)
		{
			System.out.println(i);
		}
		System.out.println("The even numbers are:");
		int i=1;
		while(i<=n) //1<=100
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
			i++;
		}
		System.out.println("The odd numbers are:");
		int j=1;
		while(j<=n)
		{
			if(j%2 != 0)
			{
				System.out.println(j);
			}
			j++;
		}
	}

}
