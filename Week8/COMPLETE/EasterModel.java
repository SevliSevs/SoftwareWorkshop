package week8;

import java.util.Observable;

/**
 * Model of the Easter class
 * @author Alice
 *
 */
public class EasterModel extends Observable {
	
	private Easter easter;
	
	public EasterModel(Easter easter)
	{
		super();
		this.easter = easter;
	}
	/**
	 * Get the current day.
	 * @return The current day
	 */
	public int getDay(){
		return this.easter.getDay();
	}
	
	/**
	 * Get the current month.
	 * @return The current month
	 */
	public int getMonth(){
		return this.easter.getMonth();
	}
	
	
	/**
	 * Get the current year.
	 * @return The current year
	 */
	public int getYear(){
		return this.easter.getYear();
	}
	
	/**
	 * Change the year to the given year.
	 * @param year The new year
	 */
	public void setYear(int year){
		this.easter.setYear(year);
		setChanged();
		notifyObservers();
	}

}
