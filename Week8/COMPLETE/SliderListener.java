package week8;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import week8lab.TemperatureModel;

public class SliderListener implements ChangeListener {
	

	private EasterModel model;
	private JSlider slider;
	
	/**
	 * Creates a new listener for the slider
	 * @param model the easter model
	 * @param slider the slider to listen to
	 */
	public SliderListener(EasterModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}

	/**
	 * called when the position of the slider is changed
	 */
	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setYear(value);
	}

}
