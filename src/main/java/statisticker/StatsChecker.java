package statisticker;

import java.util.List;

public class StatsChecker {
	
	private float maxThreshold;
	private IAlerter[] alerters;

	/**
	 * Initialize threshold and alerts
	 * @param maxThreshold
	 * @param alerters
	 */
	public StatsChecker(float maxThreshold, IAlerter[] alerters) {
		this.alerters = alerters;
		this.maxThreshold = maxThreshold;
	}

	/**
	 * Alerts are set on exceeding threshold.
	 * @param numberList
	 */
	public void checkAndAlert(List<Float> numberList) {
		Statistics.Stats stats = Statistics.getStatistics(numberList);
		
		if(stats.getMax() > this.maxThreshold) {
			for(IAlerter alerter :alerters) {
				alerter.setAlert(true);
			}
		}
		
	}

}
