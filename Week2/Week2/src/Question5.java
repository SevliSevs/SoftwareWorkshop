import java.util.ArrayList;
import java.util.Scanner;


public class Question5 {
	public static void main(String[] args)
	{
		String temp, end = "";
		int x, y= 0;
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
		
		for(int i = 0; i < list.size(); i++)
		{
			x = 1;
			temp = list.get(i);
			list.remove(i);
			while(list.contains(temp))
			{
				list.remove(list.indexOf(temp));
				x++;
			}

			if (y < x)
			{
				end = temp;
				y = x;
			}			
		}
		
		System.out.println("Most frequent string: " + end);

	}
}
