import org.asl.karelx.Uberbot;

import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	// Provide one or more constructors, as you wish
	
	public Sentry() {
		
		super(4, 3, Display.NORTH, Display.INFINITY);
	}
	
	public Sentry (int x, int y) {
		
		super (x, y, Display.NORTH, Display.INFINITY);
	}
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
		// TODO You implement this method.
		
		while (true) {
			
			move();
			
			while (!nextToABeeper()) {
				
				move();
			}
			
			turnRight();
		}
		
	}
}
