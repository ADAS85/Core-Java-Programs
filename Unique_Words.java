/* Takes a paragraph as input and calculates the total number of words and unique words based on the RegEx */

import java.util.*;
import java.util.stream.*;

public class Unique_Words 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String article;
		System.out.println("Enter The Article: ");
		article=sc.nextLine();
		String words[]=article.split("[\\s,;:.?!]+");
		System.out.println("Total Number of Words: "+words.length+"\n");
		
		int uniqueWords = (int)Arrays.stream(words).map(word->word.toLowerCase()).distinct().count();
		System.out.println("Number of Unique Words: "+uniqueWords+"\n");
		
		List<String> distinctWords = Arrays.stream(words).map(word->word.toLowerCase()).distinct().collect(Collectors.toList());
		
		int i=1;
		for(String members : distinctWords)
		{
			System.out.println(i+". "+members);
			i++;
		}
		sc.close();
	}
}
