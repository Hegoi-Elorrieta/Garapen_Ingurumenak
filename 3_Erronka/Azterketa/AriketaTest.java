package Azterketa;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class AriketaTest {

	private static Ariketa ariketa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		ariketa = new Ariketa("hegoi", "vazquez", 18);
	}
	
	@Test
	public void testAriketaKonstruktore() {
		ariketa.setIzena("hegoi");
		ariketa.setAbizena("vazquez");
		ariketa.setAdina(18);
		
		assertEquals("hegoi", ariketa.getIzena());
		assertEquals("vazquez", ariketa.getAbizena());
		assertEquals(18, ariketa.getAdina());
		}
	
	@Test
	public void testAriketaToString() {
		ariketa.setIzena("hegoi");
		ariketa.setAbizena("vazquez");
		ariketa.setAdina(18);
		
		assertEquals("Ariketa [izena=hegoi, abizena=vazquez, adina=18]", ariketa.toString());
		}
	
	@Test
	public void testHashCodeAriketa() {
		Ariketa ariketa1 = new Ariketa();
		Ariketa ariketa2 = new Ariketa();
		
		assertEquals(ariketa1.hashCode(), ariketa2.hashCode());
		}
	
	@Test
	public void testAriketaBatzuk() {
		Ariketa ariketa1 = new Ariketa();
		Ariketa ariketa2 = new Ariketa();
		Ariketa ariketa3 = new Ariketa();
		
		assertTrue(ariketa1.equals(ariketa2) && ariketa2.equals(ariketa3) && ariketa1.equals(ariketa3));
		}
	
	@Test
	public void testAriketaNuloa() {
		Ariketa ariketa = new Ariketa();

		assertFalse(ariketa.equals(null));
		}

	@Test
	public void testAriketaObjetua() {
		Ariketa ariketa = new Ariketa();

		assertFalse(ariketa.equals("Not an Erosketak object"));
		}
	
	@Test
	public void testAriketaKonstruktoreVacio() {
		Ariketa ariketa = new Ariketa();

		assertFalse(ariketa.equals("Not an Erosketak object"));
		}

}
