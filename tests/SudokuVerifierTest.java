import static org.junit.Assert.*;
import org.junit.Test;
public class SudokuVerifierTest {
 
	String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";  
	String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";  

	String v2 = "4173698256321589479587243168254371697915864323469127582896435abc123456789";  
	String v3 = "417369825632158947958724316825437169791586432346912758289643571573291684164875290";  
	String v4 = "41736982563215894795872431682543716979158643274535715732916841648752933";  
	String v5 = "417369825632158945828964357157329168416487529";  
	 
	String v6 ="afgghrhejr";  


	SudokuVerifier v = new SudokuVerifier();

		@Test
		public void testCorrectString() {
			int a = v.verify(c);
			assertEquals("correct string", a, 0);
		}

		@Test
		public void testIncorrectString1() {
			int a = v.verify(i);
			assertEquals("incorrect string", a, -2);
			
		}
		
		@Test
		public void testIncorrectString2() {
			int a = v.verify(v2);
			assertEquals("incorrect string", a, 1);
			
		}
		
		@Test
		public void testIncorrectString3() {
			int a = v.verify(v3);
			assertEquals("incorrect string", a, -1);
			
		}
		
		@Test
		public void testIncorrectString4() {
			int a = v.verify(v4);
			assertEquals("incorrect string", a, -1);
			
		}
		
		@Test
		public void testIncorrectString5() {
			int a = v.verify(v5);
			assertEquals("incorrect string", a, -1);
		}
		 
		@Test
		public void testIncorrectString6() {
			int a = v.verify(v6);
			assertEquals("incorrect string", a, -1);
		}	
	}
