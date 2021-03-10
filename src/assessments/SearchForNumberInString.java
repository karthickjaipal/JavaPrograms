package assessments;

import java.util.Arrays;
import java.util.List;

public class SearchForNumberInString {

	public static void main(String[] args)
	{
		int n=18565;
		int count=0;
		while(n!=0)
		{
			int rem=n%10; //get the last one digit out for comparison
			if(rem==5)
			{
				count++;
			}
			n=n/10; // reduce the number by one digit
		}
		System.out.println("The number of times present :"+ count);
		
		int n1=16565;
		int count1=0;
		while(n1!=0)
		{
			int rem=n1%100; //get the last two digit out for comparison
			if(rem==65)
			{
				count1++;
			}
			n1=n1/10; // reduce the number by one digit
		}
		System.out.println("The number of times present :"+ count1);
		
		String s1="124544";
		int find=45;
		int number=Integer.parseInt(s1);
		//System.out.println(num);
		while(number!=0)
		{
			int rem=number%100;
			if(rem==find)
			{
				System.out.println("The number "+find+" is present");
				break;
			}
			number=number/10;
		}
		
		String[] arr={"12","122"};
		for(String a:arr)
		{
			if(a.equals("12"))
			{
				System.out.println("element is present");
			}
		}
		
		Integer[] arr1={11,122};
		for(Integer a:arr1)
		{
			if(a==12)
			{
				System.out.println("element is present");
			}
			else
			{
				System.out.println("element not present");
			}
		}
		
		
		
		String[] arr2={"12","122"};
		int givenNumber=12;
		List<String> list = Arrays.asList(arr2);
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).equals(givenNumber))
			{
				System.out.println("The element is present");
			}
		}
		
		
		/*for(String a:arr)
		{
			if(a.equals("12"))
			{
				System.out.println("element is present");
			}
		}*/
		
		
		
		
		
		
		
	}
}
