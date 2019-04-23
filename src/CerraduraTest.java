import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CerraduraTest {

	@Test
	public void queUnaCerraduraNuevaEstaCerrada() {

		Cerradura c1 = new Cerradura(122, 2);

		boolean valorObtenido = c1.estaCerrada();
		boolean valorEsperado = false;

		Assert.assertEquals(valorEsperado, valorObtenido);

	}

	@Test
	public void queCuandoIngresoClaveCorrectaSeAbra() {

		Cerradura c1 = new Cerradura(122, 2);

		boolean valorObtenido = c1.abrir(122);

		Assert.assertTrue(valorObtenido);

	}

	@Test
	public void queCuandoIngresoClaveIncorrectaNoSeAbra() {

		Cerradura c1 = new Cerradura(122, 2);

		boolean valorObtenido = c1.abrir(1223);

		Assert.assertFalse(valorObtenido);

	}

}
