import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_AVCTest {

	@Test
	public void testArea() {
		Circulo_AVC c1 = new Circulo_AVC(-3, "circulo");
	
		double are1= c1.area();
		assertEquals(28.2744, are1);
		
	}

	@Test
	public void testPerimetro() {
		Circulo_AVC c1 = new Circulo_AVC(-3, "circulo");
		
		double per= c1.perimetro();
		assertEquals(18.8496, per);
		
	}
	
	


}
