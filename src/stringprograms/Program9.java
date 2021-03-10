package stringprograms;

public class Program9 {
	
	/*
	 * To find Number of words in a given string 
	 * 
	 */

	public static void main(String args[]) {
		int flag = 0;
		int count = 0;
		//int i = 0;
		String str = "The sunset is beautiful";
		/*while (i < str.length()) {
			if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
				flag = 0;
			}else if (flag == 0) {
				flag = 1;
				count++;
			}
			i++;
		}*/
		for(int i=0; i<str.length(); i++)
		{
			if (str.charAt(i) == ' ' || str.charAt(i) == '\n' || str.charAt(i) == '\t') {
				flag = 0;
			}else if (flag == 0) {
				flag = 1;
				count++;
			}
		}
		
		System.out.println("The string is: " + str);
		System.out.println("No of words in the above string are: " + count);
	}
}


