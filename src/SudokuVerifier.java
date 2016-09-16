import static org.junit.Assert.*;
import java.util.Arrays;

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
		else {
			
			String firstRow = candidateSolution.substring(0,9);
			Arrays.sort(firstRow.toCharArray());
			
/*			for(int j=0;j<=9;j++)
			{
				for(int i = 1; i <= 9; i++)
				{
					if(candidateSolution.charAt(i-1) != i)
					{
						return 0;
					}
				}

			}*/
		}
		return 1;
		//check
	}
	
	public int checkRows(String candidateSolution) {
		return -3;
	}
	
	
	
	
	
}
