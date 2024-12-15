import static org.junit.Assert.*;
import java.util.List;
import org.junit.Before; 
import org.junit.Test;

public class DefDifferentTests {
	QuickMaths maths;
	
	@Before
	public void setUp(){
		maths=new QuickMaths();
	}
	
	@Test
	public void testSumCorrectnessPretend() {
		int rezultat=maths.sum(10, 16);
		int rezultatAsteptat=26;
		assertEquals(rezultatAsteptat, rezultat);
	}
	
	@Test
	public void testDivisionPretend(){

		double rezultat=maths.report(10, 5);
		double rezultatAsteptat=2;
		assertEquals(rezultatAsteptat, rezultat,0.1);
	}
	
	@Test
	public void testDivisionExceptionPretend(){
		try{
			maths.report(15, 0);
			fail("No exception here");
		}catch(IllegalArgumentException er){
			
		}
	}
}
