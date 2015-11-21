import java.util.Scanner;

public class Question5 
{
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String word = in.nextLine();
		char c = word.charAt(0);
		
		for (int i = (word.length() - 1); i >= 0; i--)
		{
			if (c > word.charAt(i))
			{
				c = word.charAt(i);
			}
		}
		
		System.out.println("The first character alphabetically is \"" + c + "\"");
		
	}
}
