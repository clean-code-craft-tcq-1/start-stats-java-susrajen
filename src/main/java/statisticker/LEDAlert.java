package statisticker;

/**
 * @author USH2COB
 * Led alert setter on exceeding threshold.
 */

public class LEDAlert implements IAlerter {

	private boolean ledGlows;


	public boolean isLedGlows() {
		return ledGlows;
	}

	public void setLedGlows(boolean ledGlows) {
		this.ledGlows = ledGlows;
	}
	
	/**
	 * The method sets led alert.
	 */
	@Override
	public void setAlert(boolean alert) {
		this.setLedGlows(alert);
	}

}
