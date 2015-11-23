package week8;
/**
 * Displaying the Date of easter depending on the year given
 * @author Alice
 *
 */
public class Easter {

	private int day;
	private int month;
	private int year;
	/**
	 * Sets the year and calls algorithm to calc easter date
	 * @param year year to calculate date of easter for
	 */
	public Easter(int year)
	{
		this.year = year;
		anonAlgorithm();
		
	}
	/**
	 * gets the current day
	 * @return the day of the month easter will fall on
	 */
	public int getDay() {
		return day;
	}
	/**
	 * gets the current month
	 * @return the month easter will fall in
	 */
	public int getMonth() {
		return month;
	}
	/**
	 * gets the current year
	 * @return the year being used to calculate easter date
	 */
	public int getYear() {
		return year;
	}
	/**
	 * re-assign the year to calculate easter date for
	 * @param year the year to change to
	 */
	public void setYear(int year) {
		this.year = year;
		anonAlgorithm();
	}
	
	/**
	 * Implements the Anonymous Gregorian Algorithm to set the Day and Month to the date of easter depending on the year
	 */
	public void anonAlgorithm()
	{
		double a = year%19;
		double b = Math.floor(year/100);
		double c = year%100;
		double d = Math.floor(b/4);
		double e = b%4;
		double f = Math.floor ((b + 8) / 25);
		double g = Math.floor ((b - f + 1) / 3);
		double h = ((19*a) + b - d - g + 15)%30;
		double i = Math.floor (c / 4);
		double k = c%4;
		double L = (32 + (2*e) + (2*i) - h - k)%7;
		double m = Math.floor ((a + (11*h) + (22*L)) / 451);
		this.month = (int)(Math.floor ((h + L - (7*m) + 114) / 31));
		this.day = (int)(((h + L - (7*m) + 114)%31) + 1);
	}
	
	
}
