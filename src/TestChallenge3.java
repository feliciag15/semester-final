import edu.fcps.karel2.Display;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge3 {
	// TODO Complete the BeepFarmer class, provided, by implementing the reap() method

	public static void main(String[] args) {
		
		Display.openWorld("src/maps/farm.map");
		Display.setSize(12, 12);
		
		BeepFarmer paul = new BeepFarmer();
		paul.reap(3, 6);
		// TODO Create an instance of a BeepFarmer with no beepers, anywhere on the farm
		// TODO Have the farmer gather all the beepers from the garden plot in the center of the map
		// TODO Have the farmer drop at location (1, 1) all the beepers picked and then move aside.
	}

}

