package counter;

import java.util.Observable;

/**
 * Print the counter value on the console whenever it changes.
 * @author Narisa Singngam
 */

public class ConsoleView implements java.util.Observer {
	private Counter counter;

	/**
	 * A ConsoleView with reference to a counter (the subject).
	 * 
	 * @param counter
	 *            the counter to display.
	 */
	public ConsoleView(Counter counter) {
		this.counter = counter;
	}

	/**
	 * Update counter
	 */
	@Override
	public void update(Observable subject, Object info) {
		if (info != null) {
			System.out.printf("Count: %d", info.toString());
		}

	}

}
