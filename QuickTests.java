import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before; 
import org.junit.Test;

public class QuickTests {
	QuickMaths maths;
	
	@Before
	public void setUp(){
		maths=new QuickMaths();
	}
	
	@Test
	public void testSumCorrectness() {
		int rezultat=maths.sum(10, 16);
		int rezultatAsteptat=26;
		assertEquals(rezultatAsteptat, rezultat);
	}
	
	@Test
	public void testDivision(){

		double rezultat=maths.report(10, 5);
		double rezultatAsteptat=2;
		assertEquals(rezultatAsteptat, rezultat,0.1);
	}
	
	@Test
	public void testDivisionException(){
		try{
			maths.report(15, 0);
			fail("No exception here");
		}catch(IllegalArgumentException er){
			
		}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testreportExceptieJUnit4(){
		maths.report(66, 0);
	}
	
	@Test
	public void testreportVirgulaMobila(){
		double rezultat=maths.report(10, 4);
		double rezultatAsteptat=2.5;
		assertEquals(rezultatAsteptat, rezultat,0.1);
	}
	
	@Test
	public void testisEvenCorect(){
		assertTrue(maths.isEven(10));
		assertFalse(maths.isEven(11));
		assertFalse(maths.isEven(-13));
	}
	
	@Test
	public void testevenNumberListCorect(){
		List<Integer> lista=maths.evenNumberList(10);
		for(Integer element:lista){
			assertTrue(maths.isEven(element));
		}
	}
	
	@Test
	public void testevenNumberListDimensiune(){
		int nrElemente=5;
		List<Integer> lista=maths.evenNumberList(nrElemente);
		assertEquals(nrElemente, lista.size());
	}
	
	@Test
	public void testevenNumberListNULL(){
		List<Integer> lista=maths.evenNumberList(0);
		assertNull(lista);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testevenNumberListNumarNegativ(){
		List<Integer> lista=maths.evenNumberList(-6);

	}
}
