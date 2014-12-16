/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import edu.fcps.karel2.Display;
import org.asl.karelx.Squarebot; 


public class TestChallenge1 {
	// TODO Complete the provided Sentry class by implementing its patrol() method

	public static void main(String[] args) {
		Display.openDefaultWorld(); 
		
		Squarebot pete = new Squarebot(9, 3); 
		pete.layCorners(5);
		
		Sentry mary = new Sentry();
		mary.patrol();
		
	
	}

}
