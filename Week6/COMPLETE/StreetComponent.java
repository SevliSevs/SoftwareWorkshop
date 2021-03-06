package week6real;

import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class StreetComponent extends JComponent {

	private House[] houses;
	private int xCoord;
	private int yCoord;
	private int houseSize;
	
	/**
	 * Create a street of houses evenly spaced apart
	 * @param noOfHouses the number of houses to be on the street
	 * @param baseHouse the house that will used as a starting position of the street and determine house size for all houses
	*/
	public StreetComponent(int noOfHouses, House baseHouse)
	{
		super();
		this.houses = new House [noOfHouses];
		this.xCoord = baseHouse.getHouseX();
		this.yCoord = baseHouse.getHouseY();
		this.houseSize = baseHouse.getHouseSize();
		for(int i = 0; i < houses.length; i++)
		{
			houses[i] = new House(this.xCoord, this.yCoord, this.houseSize);
			this.xCoord += (this.houseSize + this.houseSize/3);
		}
	}
	
	/**
	paint component on graphics object
	@param g the graphics object
	*/
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		int spacing = (this.houseSize/2) + (this.houseSize/7);
		for(int i = 0; i < this.houses.length; i++)
		{
			this.houses[i].draw(g2);
			g2.drawString(Integer.toString(i+1),(this.houses[i].getHouseX()+ spacing), (this.yCoord + spacing));
		}
	}
}
