package week3;
public class TestArrayList {

	public static void main(String[] args)
	{
		MyArrayList list = new MyArrayList();
		for (int i = 0; i< 50; i++)
		{
			list.add("This is: " + i);
		}
		System.out.println(list.getString(0));
		System.out.println(list.getString(29));
		System.out.println(list.getString(49));
		System.out.println(list.getString(50));
		System.out.println(list.getString(-1));
	}
		
}
