import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;



public class SudokuVerifier {
	

	
	public int verify(String candidateSolution) {
		// returns 0 if the candidate solution is correct
		int length1 = candidateSolution.length();
		
		if (length1 != 81) {
			return -1;
		}
		else
			return 0;
		
		//check
	}
	
	
}
