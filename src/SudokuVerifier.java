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
		if ( !candidateSolution.matches("[1-9]+")) {
			return -1;
		}
		else
			return 0;
		
		for(int j=0;j<=9;j++)
		{
				for(int i = 1; i <= 9; i++)
				{
						if(candidateSolution.charAt(i-1) != i)
						{
								return false;
						}
				}
		
		}
		return true;
		//check
	}
	
	
	
	
	
}
