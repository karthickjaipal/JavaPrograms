package numberprograms;

public class Program5 {

	public static void main(String[] args)
	{
		int n=8;
		int total;
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		total = (n + 1) * (n + 2) / 2;  
		System.out.println(total);
		for (int i = 0; i < n; i++)
		{
			total= total- a[i];
		}
		System.out.println(total);
	}



}
