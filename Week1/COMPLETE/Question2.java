import java.util.Scanner;

public class Question2 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int x = 0, y=0, count = 0;
		while(x >= 0)
		{
			if (x < y || count == 1)
			{
				y = x;
			}
			count++;
			System.out.print("Please input a number: ");
			x = in.nextInt(); in.nextLine();
		}
		System.out.println("The smallest number was: " + y);
	}
}
