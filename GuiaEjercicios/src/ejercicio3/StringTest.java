package ejercicio3;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.Test;

//propertires, java build path. libraries, junit , ifnish agrego bibilioteca de jUnit

public class StringTest {
	
	@Test
	public void segundaPalabraTest() {
		ManejoString ms = new ManejoString();
		try {
			String respuesta = ms.segundaPalabra("Hola hola");
			Assert.assertEquals("hola",respuesta); //no tira excepcion y tienen q ser iguales
		} catch (Exception e) {
			Assert.fail();
			// si de esta linea sale una excepcion el test tiene q fallar
		}
		
	}
	@Test
	public void segundaPalabraTestError() {
		ManejoString ms = new ManejoString();
		try {
			ms.segundaPalabra("vacio");
			Assert.fail(); //y si no tira excepcion hay q hacer q el test falle
		} catch (Exception e) {
			Assert.assertTrue(true);
			// obligamos a q el test de verde si tira excepcion 
		}
	}
}
