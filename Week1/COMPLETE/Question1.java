import java.util.Scanner;

public class Question1 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please input a number: ");
		int x = in.nextInt(); in.nextLine();
		int y = 0;
		while (y <= (x-1) || y <= x)
		{
			System.out.println(y);
			y +=2;
		}
	}

}
