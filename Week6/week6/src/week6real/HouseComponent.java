package week6real;

import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

	public class HouseComponent extends JComponent
	{
		private House house;
		
		/**
		Create a component with a particular house location and size
		@param xCoord top left x coordinate of house
		@param yCoord top left y coordinate of house
		@param houseSize height and width of main body of house
		*/
		public HouseComponent(int xCoord, int yCoord, int houseSize)
		{
			super();
			house = new House(xCoord, yCoord, houseSize);
		}
		
		/**
		paint component on graphics object
		@param g the graphics object
		*/
		public void paintComponent(Graphics g)
		{
			Graphics2D g2 = (Graphics2D)g;
			
			house.draw(g2);
		}
	}
		
