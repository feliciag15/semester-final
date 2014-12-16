import org.asl.karelx.Farmer;

/**
 * Represents a farmer capable of sowing or reaping beepers from a rectangular garden
 *
 */
public class BeepFarmer extends Farmer {

	//  TODO Add one or more constructors, as needed
	
	public BeepFarmer() {
		
		super (1, 1, 0);
	}
	
	public BeepFarmer(int x, int y, int z) {
		
		super (x, y, z);
	}
	
	/**
	 * Access all locations in a rectangular garden and pick up any beepers found
	 * 
	 * Precondition: Farmer is starting in the southwest corner of the area to be harvested.
	 * 
	 * @param width			the width of the garden (number of columns)
	 * @param height		the height of the garden (number of rows)
	 * 
	 * Ex. reap(7, 4) should gather all beepers from an area 7 rows wide and 4 rows tall
	 */
	public void reap(int width, int height) {
		// TODO You implement this
		
		teleport(3, 5);
		int r = this.getX();
		int c = this.getY();
		
		for (int i= 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				
				while(nextToABeeper()) {
					
					pickBeeper();
				}
				teleport(r+i, c+j);
				
			}
			
			pickBeeper();
			
			
		}
		
		teleport(1, 1);
		int numBeepers = getBeepers();
		for (int b = 0; b < numBeepers; b++) {
			
			putBeeper();
		}
		turnRight();
		move();
		
	}
	
	/**
	 * Access all locations in a rectangular garden and plant one beeper at each location
	 * 
	 * Precondition: Farmer is starting in the southwest corner of the area to be sown.
	 * 
	 * @param width		the width of the garden (number of columns)
	 * @param height	the height of the garden (number of rows)
	 */
	public void sow(int width, int height) {
		int startX = this.getX();
		int startY = this.getY();
		for (int i = 0; i< width; i++) {
			for (int j = 0; j<height; j++) {
				teleport(startX+i, startY+j);
				if (this.hasBeepers()) {
					putBeeper();
				}
			}
		}
	}
}
