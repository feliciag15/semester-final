import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Display;
/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

	//  TODO Add one or more constructors, as needed
	
	public Horse() {
		
		super (1, 1);
	}
	
	public Horse(int x, int y) {
		
		super (x, y);
	}
	
	/**
	 * Wander around in random directions until a specified number of steps have been taken.
	 * At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count		the total number of steps to take
	 * @param timer		the interval at which to drop a beeper
	 * 
	 * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
	 */
	public void wander(int count, int timer) {
		// TODO You implement this
		
		if (!backIsClear()) {
			
			move();
		} else if (!leftIsClear()) {
			
			turnRight();
			
		} else if (!rightIsClear()) {
			
			turnLeft();
			
		}
		
		for (int i = 0; i <= count; i++) {
			
			wander(count);
			
			if (i == timer) {
				
				putBeeper();
			} else if (i == (timer + timer))
			
				putBeeper();
		
		}
		
		
		
		
	}
}
