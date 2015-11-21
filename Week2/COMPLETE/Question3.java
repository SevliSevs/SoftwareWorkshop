import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<String>();
		System.out.println("Enter a string (enter stop to finish)");
		String s = in.nextLine();
		while(!s.equals("stop"))
		{
			list.add(s);
			System.out.println("Enter a string (enter stop to finish)");
			s = in.nextLine();
		}
		
		for (int i = 0; i < list.size(); i++)
		{
			if (list.get(i).length() > 3)
			{
				list.add(i+1, list.get(i).substring(0, 3));
				list.remove(i);
			}
			System.out.println(list.get(i));
		}
		
	}
}
