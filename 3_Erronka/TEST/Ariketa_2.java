package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ariketa_2 {
	
	int zbk1;
	int zbk2;
	
	public int resta() {
		int emaitza;
		if(resta2()) emaitza = zbk1 - zbk2;
		else emaitza= zbk2 - zbk1;
		
		return (emaitza);
	}
	
	public boolean resta2() {
		if(zbk1 >= zbk2) return true;
		else return false;
	}
	
	public Integer divide2() {
		if(zbk2 == 0) return null;
		int emaitza = zbk1 / zbk2;
		return (emaitza);
	}

	@Test
	void testResta() {
		Ariketa_2 eragiketa = new Ariketa_2();
		
		eragiketa.zbk1 = 8;
		eragiketa.zbk2 = 5;
		
		assertEquals(3, eragiketa.resta());
	
	}
	
	@Test
	void testResta2True() {
		Ariketa_2 eragiketa = new Ariketa_2();
		
		eragiketa.zbk1 = 8;
		eragiketa.zbk2 = 5;
		
		assertTrue(eragiketa.resta2());
	
	}
	
	@Test
	void testResta2False() {
		Ariketa_2 eragiketa = new Ariketa_2();
		
		eragiketa.zbk1 = 5;
		eragiketa.zbk2 = 8;
		
		assertFalse(eragiketa.resta2());
	
	}
	
	@Test
	void testDivide2Null() {
		Ariketa_2 eragiketa = new Ariketa_2();
		
		eragiketa.zbk1 = 8;
		eragiketa.zbk2 = 0;
		
		assertNull(eragiketa.divide2());
	
	}
	
	@Test
	void testDivide2NotNull() {
		Ariketa_2 eragiketa = new Ariketa_2();
		
		eragiketa.zbk1 = 10;
		eragiketa.zbk2 = 5;
		
		assertNotNull(eragiketa.divide2());
	}
}
