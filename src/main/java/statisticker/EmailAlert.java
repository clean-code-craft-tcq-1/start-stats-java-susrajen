package statisticker;

/**
 * @author USH2COB
 * Email alert setter on exceeding threshold.
 */
public class EmailAlert implements IAlerter {

	private boolean emailSent;

	public boolean isEmailSent() {
		return emailSent;
	}

	public void setEmailSent(boolean emailSent) {
		this.emailSent = emailSent;
	}

	/**
	 * The method sets an alert for email
	 */
	@Override
	public void setAlert(boolean alert) {
		this.setEmailSent(alert);
	}

}
