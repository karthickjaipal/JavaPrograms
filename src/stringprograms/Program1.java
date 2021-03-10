package stringprograms;

/*
 * Finding the number of words , Largest and smallest word in the given string
 * 
 */
public class Program1  
{  
	public static void main(String[] args){   
		String givenstring = "Hardships often prepare ordinary people for an extraordinary destiny";  
		String word = "", small = "", large="";  
		String[] words = new String[100];  
		int length = 0;  

		//Add extra space after string to get the last word in the given string  
		givenstring = givenstring + " ";  

		System.out.println(givenstring.length());
		
		for(int i = 0; i < givenstring.length(); i++){  
			//Split the string into words  
			if(givenstring.charAt(i) != ' '){  
				word = word + givenstring.charAt(i);  
			}  
			else{  
				//Add word to array words  
				words[length] = word;  
				//Increment length  
				length++;  
				//Make word an empty string  
				word = "";  
			}  
		}  

		//Initialize small and large with first word in the string  
		small = large = words[0];  

		//Determine smallest and largest word in the string  
		for(int k = 0; k < length; k++){  

			//If length of small is greater than any word present in the string  
			//Store value of word into small  
			if(small.length() > words[k].length())  
				small = words[k];  

			//If length of large is less than any word present in the string  
			//Store value of word into large  
			if(large.length() < words[k].length())  
				large = words[k];  
		}  

		System.out.println("Smallest word: " + small);  
		System.out.println("Largest word: " + large);  
	
		int j=0; // initialization
		int flag=0;
		int count=0;
		while(j<givenstring.length()) //condition
		{
			if(givenstring.charAt(j) == ' ' || givenstring.charAt(j) == '\n' || givenstring.charAt(j) == '\t')
			{
				flag = 0;
			}
			else if(flag == 0)
			{
				flag = 1;
				count ++;
			}
			j++ ; // increment
		}
		System.out.println("No of words in the above string are : "+ count);	
			
		}
		
		
	}  
		
		



