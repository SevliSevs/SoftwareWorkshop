package week6real;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HouseTest {
	public static void main(String[] args)
	{

		JFrame frame = new JFrame();
		frame.setSize(600, 400);
		frame.setTitle("Alice Pilgrim's Frame 1466089");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//RectangleComponent comp = new RectangleComponent(100, 100);
		//HouseComponent comp = new HouseComponent(200, 100, 100);
		House house = new House(10, 100, 100);
		StreetComponent comp = new StreetComponent(100, house); 
		frame.add(comp);
		
		
		
		frame.setVisible(true);
	}

}
