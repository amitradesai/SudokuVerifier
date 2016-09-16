import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891

	@Test
	public void testVerify_EmptyString_ReturnsMinus1() {
		SudokuVerifier test = new SudokuVerifier();
		int result = test.verify("");
		assertEquals(-1, result);
	}
	
	@Test
	public void testVerify() {
		String candidateString = "2123456789912345678891234567789123456678912345567891234456789123345678912234567891";
		SudokuVerifier test = new SudokuVerifier();
		int result = test.verify(candidateString);
		assertEquals(-1, result);
	}
	
	@Test
	public void testVerify() {
		String candidateString = "123456789123456789123456789123456789123456789";
		SudokuVerifier test = new SudokuVerifier();
		int result = test.verify(candidateString);
		assertEquals(-2, result);
	}
	
	@Test
	public void testLength() {
		String aString = "123987842183090982378974019283423467234762634788798234?";
		int length1 = aString.length();
		 
		assertEquals(81, length1);
	}
	

	
	
}
