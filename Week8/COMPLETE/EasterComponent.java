package week8;

import javax.swing.JPanel;
import javax.swing.JSlider;

public class EasterComponent extends JPanel{
	
	/**
	 * Creates an easter component to add to the frame
	 * @param year year to get date of easter in
	 * @param min the min year to be displayed 
	 * @param max the max year to be displayed
	 * @param initial the initial year for the slider to be set at
	 */
	public EasterComponent(Easter year, int min, int max, int initial)
	{
		super();
		
		// model 
		EasterModel model = new EasterModel(year);
		
		// views
		EasterView easter = new EasterView(model);
		
		// make views observe model
		model.addObserver(easter);
		
		// create control
		JSlider slider = new JSlider(min, max, initial);
		slider.setPaintTicks(true);
		slider.setMajorTickSpacing((max - min)/4);
		slider.setPaintLabels(true);
		slider.setLabelTable(slider.createStandardLabels((max-min)/4));
		
		// create listener
		SliderListener listen = new SliderListener(model, slider);
		
		// make listeners listen to controls
		slider.addChangeListener(listen);
		
		// place views and controls on panel
		add(slider);
		add(easter);
		

	}

}
