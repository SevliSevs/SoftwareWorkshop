import java.util.Scanner;

public class Question4 
{
	public static void main(String[] args)
	{
		String word;
		int x = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a string: ");
		word = in.nextLine();
		char[] rev = new char[word.length()];
		System.out.print(word + " backwards is ");
		for (int i = word.length(); i > 0; i--)
		{
			rev[x] = word.charAt(i-1);
			x++;
		}
		String reverse = new String(rev);
		System.out.println(reverse);
		if(word.compareTo(reverse) == 0)
		{
			System.out.println("\n" + word + " is a palindrome!");
		}
		else
		{
			System.out.println("\n" + word + " is not a palindrome");
		}
	}
}
