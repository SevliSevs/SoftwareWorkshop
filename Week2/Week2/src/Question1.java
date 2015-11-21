import java.util.ArrayList;
import java.util.Scanner;

public class Question1 {
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter a string (enter stop to finish)");
		String s = in.nextLine();
		int x = 0, y = 0;
		while(!s.equals("stop"))
		{
			list.add(s);
			System.out.println("Enter a string (enter stop to finish)");
			s = in.nextLine();
		}
		
		for (int i = 0; i < list.size(); i++)
		{
			if(x < list.get(i).length())
			{
				x = list.get(i).length();
				y = i;
			}
		}
		
		System.out.println("The longest string was " + list.get(y));
	}

}
