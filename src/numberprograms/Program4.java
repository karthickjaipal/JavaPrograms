package numberprograms;

public class Program4 {
	public static void main(String [] args)
	{
		int[] arr ={13,-42,56,67,78,89};
		int sum=0;
		int max,min;
		
		for(int i=0 ;i <arr.length;i++)
		{
			sum=sum+arr[i];
		}
		System.out.println("the sum is :"+sum);
		
		max=min=arr[0];
		
		for(int i=0; i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println("the smallest number is :"+min);
		
		for(int i=0;i<arr.length;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}
		}
		System.out.println("the Largest number is :"+max);
		int find=67;
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==find)
			{
				count++;
				System.out.println("number of times "+ find + " exists : "+ count);
			}
		}
		
		int[] arr1 = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--)
		{
			arr1[i]=arr[i];
		}
		System.out.println("Copied Array in regular order");
		
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		
		System.out.println("Copied Array in reverse order");
		for(int i=arr1.length-1; i>=0; i--)
		{
			System.out.print(arr1[i]+ " ");
		}
		
	}

}
