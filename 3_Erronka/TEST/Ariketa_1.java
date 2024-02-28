package TEST;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ariketa_1 {
	
	int num1;
	int num2;
	
	public int resta() {
		int result;
		if(resta2()) result = num1 - num2;
		else result = num1 - num2;
		
		return (result);
	}
	
	public boolean resta2() {
		if(num1 >= num2) return true;
		else return false;
	}
	
	public Integer divide2() {
		if(num2 == 0) return null;
		int result = num1 / num2;
		return (result);
	}

	@Test
	void testResta() {
		Ariketa_1 ariketa = new Ariketa_1();
		
		ariketa.num1 = 8;
		ariketa.num2 = 5;
		
		assertEquals(3, ariketa.resta());
	}
	
	@Test
	void testResta2True() {
		Ariketa_1 ariketa = new Ariketa_1();
		
		ariketa.num1 = 8;
		ariketa.num2 = 5;
		
		assertTrue(ariketa.resta2());
	}
	
	@Test
	void testResta2False() {
		Ariketa_1 ariketa = new Ariketa_1();
		
		ariketa.num1 = 5;
		ariketa.num2 = 8;
		
		assertFalse(ariketa.resta2());
	}
	
	@Test
	void testDivide2Null() {
		Ariketa_1 ariketa = new Ariketa_1();
		
		ariketa.num1 = 10;
		ariketa.num2 = 0;
		
		assertNull(ariketa.divide2());
	}
	
	@Test
	void testDivide2NotNull() {
		Ariketa_1 ariketa = new Ariketa_1();
		
		ariketa.num1 = 8;
		ariketa.num2 = 5;
		
		assertNotNull(ariketa.divide2());
	}

}
