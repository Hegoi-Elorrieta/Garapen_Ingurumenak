package Azterketa;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import Azterketa.Ariketa;

public class AriketaTest {
	
	private static Ariketa ariketa;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		ariketa = new Ariketa("Hegoi", "Vazquez", 18);
		
	}
	
	 @Test
	 public void testConstructorVacio() {
		 
	   Ariketa ariketa = new Ariketa();
	        
	   assertNull(ariketa.getIzena());
	   assertNull(ariketa.getAbizena());
	   assertEquals(0, ariketa.getAdina());
	     
	}

	@Test
	public void testAriketaKonstruktore() {
		
		ariketa.setIzena("Hegoi");
		ariketa.setAbizena("Vazquez");
		ariketa.setAdina(18);
		
		assertEquals("Hegoi", ariketa.getIzena());
		assertEquals("Vazquez", ariketa.getAbizena());
		assertEquals(18, ariketa.getAdina());
		
	}
	
	@Test
	public void testAriketaToString() {
		
		ariketa.setIzena("Hegoi");
		ariketa.setAbizena("Vazquez");
		ariketa.setAdina(18);
		
		assertEquals("Ariketa [izena=Hegoi, abizena=Vazquez, adina=18]", ariketa.toString());
		
	}
	
	@Test
	public void testHasCodeAriketa() {
		
		Ariketa ariketa1 = new Ariketa("Hegoi", "Vazquez", 18);
		Ariketa ariketa2 = new Ariketa("Hegoi", "Vazquez", 18);
		
		assertEquals(ariketa1.hashCode(), ariketa2.hashCode());
		
	}
	
	@Test
	public void testAretoEquals() {
		
		Ariketa ariketa = new Ariketa("Hegoi", "Vazquez", 18);
		
		assertTrue(ariketa.equals(ariketa));
		
	}
	
	@Test
	public void testAretoBatzuk() {
		
		Ariketa ariketa1 = new Ariketa("Hegoi", "Vazquez", 18);
		Ariketa ariketa2 = new Ariketa("Hegoi", "Vazquez", 18);
		
		assertTrue(ariketa1.equals(ariketa2) && ariketa2.equals(ariketa1));
		
	}
	
	@Test
	public void testAretoNuloa() {
		
		Ariketa ariketa = new Ariketa("Hegoi", "Vazquez", 18);
		
		assertFalse(ariketa.equals(null));
		
	}
	
	@Test
	public void testAretoObjetua() {
		
		Ariketa ariketa = new Ariketa("Hegoi", "Vazquez", 18);
		
		assertFalse(ariketa.equals("Not an Ariketa object"));
		
	}
	
	@Test
	public void testAretoEzberdina() {
		
		Ariketa ariketa1 = new Ariketa("Hegoi", "Vazquez", 18);
		Ariketa ariketa2 = new Ariketa("Haizea", "Arrieta", 19);
		
		assertFalse(ariketa1.equals(ariketa2));
		
	}

}
