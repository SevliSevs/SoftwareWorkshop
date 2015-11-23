package week8;

import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
/**
 * Text view of easter date
 * @author Alice
 *
 */
public class EasterView extends JLabel implements Observer{
	
	private EasterModel model;
	/**
	 * Initialise view with model
	 * @param model the underlying easter model
	 */
	public EasterView(EasterModel model)
	{
		super();
		this.model = model;
		setText("In the year " + model.getYear() + " " + "easter was on " +  model.getDay() + " " + monthToString(model.getMonth()));
		
	}
	public void update(Observable obs, Object obj)
	{
		setText("In the year " + model.getYear() + " " + "easter was on " +  model.getDay() + " " + monthToString(model.getMonth()));
	}
	/**
	 * Switch statement to convert int of month to months string
	 * @param i the integer corresponding to the month (eg "1")
	 * @return the month in string form (eg "January")
	 */
	public String monthToString(int i)
	{
		switch (i)
		{
		case 1: return "January";
		case 2: return "February";
		case 3: return "March";
		case 4: return "April";
		case 5: return "May";
		case 6: return "June";
		case 7: return "July";
		case 8: return "August";
		case 9: return "September";
		case 10: return "October";
		case 11: return "November";
		case 12: return "December";
		default: return "invalid";
		}
	}

}
