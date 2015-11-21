import java.util.Scanner;

public class Question3 
{
	public static void main(String[] args)
	{
		int x;
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a postive number: ");
		do
		{
			x = in.nextInt(); in.nextLine();
			if(x <= 0)
			{
				System.out.print("Number is not positive, try again: ");
			}
		}while(x <= 0);
		
		while(x > 0)
		{
			for(int i = 0; i< x; i++)
			{
				System.out.print("*");
			}
			System.out.println();
			x -= 1;
		}
		
	}

}
