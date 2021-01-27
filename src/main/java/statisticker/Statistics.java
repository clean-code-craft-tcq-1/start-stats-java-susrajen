package statisticker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Statistics {
	public static Stats getStatistics(List<Float> numbers) {
		Stats stats = new Stats();
		stats.getStats(numbers);
		return stats;
	}

	static class Stats {

		private Float average;
		private Float min;
		private Float max;
		
		public Float getAverage() {
			return average;
		}

		public void setAverage(Float average) {
			this.average = average;
		}

		public Float getMin() {
			return min;
		}

		public void setMin(Float min) {
			this.min = min;
		}

		public Float getMax() {
			return max;
		}

		public void setMax(Float max) {
			this.max = max;
		}

		/**
		 * The method returns the statistics of the list passed
		 * @param numbers
		 */
		public void getStats(List<Float> numbers) {
			// Check for empty list and return NaN
			if (numbers == null || numbers.size() == 0) {
				setAverage(Float.NaN);
				setMax(Float.NaN);
				setMin(Float.NaN);
			} else {
				// Sort the list
				List<Float> statsList = new ArrayList<Float>(numbers);
				Collections.sort(statsList);

				// Set min and max value from sorted list
				setMin(statsList.get(0));
				setMax(statsList.get(statsList.size() - 1));

				// Average calculation
				Float sumStatsList = 0.0f;
				for (Float element : statsList) {
					sumStatsList += element;
				}
				setAverage(sumStatsList / statsList.size());
			}

		}
	
	}
}
