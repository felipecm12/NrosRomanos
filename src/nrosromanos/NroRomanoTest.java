package nrosromanoss;

import static org.junit.Assert.*;

import org.junit.Test;

public class NroRomanoTest {

	@Test
	public void test() {
		NroRomano romano = new NroRomano();
		String respuesta = romano.convertir(812);
		assertEquals(respuesta, "DCCCXII");
	}

}
