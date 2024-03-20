package Azterketa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Ariketak {
	
	int num1;
	int num2;

	public int resta() {
		int result;
		if(resta2()) result = num1 - num2;
		else result = num2 - num1;
		
		return (result);
	}
	
	public boolean resta2() {
		if (num1 >= num2) return true;
		else return false;
	}
	
	public Integer divide2() {
		if (num2 == 0) return null;
		int result = num1 / num2;
		return (result);
	}
	
	@Test
    void testResta() {
        Ariketak ariketak = new Ariketak();
        ariketak.num1 = 10;
        ariketak.num2 = 5;

        // Aquí comprobamos que la resta sea igual a 5 (num1 - num2)
        assertEquals(5, ariketak.resta());
    }
	
	@Test
    void testResta2() {
        Ariketak ariketak = new Ariketak();
        ariketak.num1 = 5;
        ariketak.num2 = 10;

        // Verificamos que el resultado de la resta2 sea false
        assertFalse(ariketak.resta2());
    }
	
	@Test
    void testDivide2() {
        Ariketak ariketak = new Ariketak();
        ariketak.num1 = 10;
        ariketak.num2 = 0;

        // Verificamos que cuando num2 es 0, el método divide2 devuelve null
        assertNull(ariketak.divide2());
    }
	
	@Test
    void testResta3() {
        Ariketak ariketak = new Ariketak();
        ariketak.num1 = 5;
        ariketak.num2 = 10;

        // Verificamos que el resultado de la resta2 no sea null
        assertNotNull(ariketak.resta2());
    }
	
	@Test
    void testResta4() {
        Ariketak ariketak = new Ariketak();
        ariketak.num1 = 10;
        ariketak.num2 = 5;

        // Verificamos que el resultado de la resta2 sea true
        assertTrue(ariketak.resta2());
    }

}
