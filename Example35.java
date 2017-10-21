package example35;
import java.util.Scanner;
import java.util.*;
/*   
Author: Chan In Kou
Purpose: The Display will show another string practice
*/
public class Example35
{
	public static void main(String[] args) 
	{
	    //create a Scanner
		Scanner in = new Scanner(System.in);
		
        //create variable
		String upper = "";
		String letter = "";
		String position = "";
		String vowel = "aeiouAeIOU";
		int numOfVowels = 1;
		int numOfCons = -1;
	    
		//Enter a String
	    System.out.print("Enter a String: ");
		letter = in.nextLine();
		
		//create variable
		int length = letter.length();
		
		for(int x = 0; x < length; x++)
		{
			if(Character.isUpperCase(letter.charAt(x)))
			{
            char word = letter.charAt(x);
            upper += word + " ";
            }
		}
		
		//display the upper case
		System.out.println("\nUppercase Letters: \t" + upper);
		
		//display the vowels replaced
		System.out.println("Vowels Replaced: \t" + letter.replaceAll("[aeiouAEIOU]", "_"));
		
		//To find the number of vowels in the string and the number of consonants in the string
		for (int u = 0; u < length; u++)
		{
			char currentWord = letter.charAt(u);
            if (vowel.indexOf(currentWord) >= 0)
			{
                numOfVowels++;
			}
            else if(Character.isLetter(currentWord))
		    {
                numOfCons++;
			}
        }
		
		//display the number of vowels in the string
		System.out.println("Number of Vowels: \t" + numOfVowels);
		
		//The number of consonants in the string
        System.out.println("Number of Consonants: \t" + numOfCons);	
         
		//looping for the position
		for(int i = 0; i < letter.length(); i ++)
		{ if(letter.charAt(i) == 'a' 
			|| letter.charAt(i) == 'e'
			|| letter.charAt(i) == 'i'
			|| letter.charAt(i) == 'o'
			|| letter.charAt(i) == 'u'
			|| letter.charAt(i) == 'A'
			|| letter.charAt(i) == 'E'
			|| letter.charAt(i) == 'I'
			|| letter.charAt(i) == 'O' 
			|| letter.charAt(i) == 'U') 
			position += i + " "; 
	    } 
		//display the position of vowels
	    System.out.println("Position of Vowels: \t" + position);
    }
}