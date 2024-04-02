import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

@RunWith(Parameterized.class)
public class SudokuVerifierParameterizedTest {
 
	private SudokuVerifier verifier = new SudokuVerifier();
	private String testString;
	private int expectedResult;
	
	
	//collection of test data with inputs (testString) and expected results
	@Parameters
	   public static Collection<Object[]> data() {
	      return Arrays.asList(new Object[][] {
	         { "417369825632158947958724316825437169791586432346912758289643571573291684164875293", 0},
	         { "123456789912345678891234567789123456678912345567891234456789123345678912234567891", -2}
	      });
	   }
	
	//test class constructor
	public SudokuVerifierParameterizedTest(String testString, int expectedResult) {
	      this.testString = testString;
	      this.expectedResult = expectedResult;
	   }
	
	
	@Test
	public void returnCorrect() {
		int returnNumber = verifier.verify(testString);
		assertEquals(returnNumber, expectedResult);
	}

}