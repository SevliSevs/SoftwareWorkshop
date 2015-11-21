package week8lab;
import javax.swing.event.*;
import javax.swing.JSlider;


public class SliderListenerLab implements ChangeListener
{

	private TemperatureModel model;
	private JSlider slider;

	public SliderListenerLab(TemperatureModel model, JSlider slider)
	{
		this.model = model;
		this.slider = slider;
	}

	public void stateChanged(ChangeEvent e)
	{
		int value = slider.getValue();
		model.setCelcius(value);
	}
}
