package kahvesiparis;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import exceptions.KahveSiparisException;

public class KahveSiparisTest {

	@Test
	public void userInputShouldThrowException() {

		String userInput = "0";
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);

	    String expected = "Siparişiniz alınırken hata oluştu. exceptions.KahveSiparisException: İstediğiniz kahve türü menüde yoktur.";
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream printStream = new PrintStream(baos);
	    System.setOut(printStream);
	    KahveSiparis.main(null);
	    
	    String[] lines = baos.toString().split(System.lineSeparator());
	    String actual = lines[lines.length-1];

	    assertEquals(expected,actual);
	}
	
	@Test
	public void userInputShouldBeValid() {

		String userInput = "1";
	    ByteArrayInputStream bais = new ByteArrayInputStream(userInput.getBytes());
	    System.setIn(bais);

	    String expected = "Espresso seçtiniz, bu içeceğimiz bir doz espresso içermektedir. Afiyet olsun";
	    ByteArrayOutputStream baos = new ByteArrayOutputStream();
	    PrintStream printStream = new PrintStream(baos);
	    System.setOut(printStream);

	    KahveSiparis.main(null);

	    String[] lines = baos.toString().split(System.lineSeparator());
	    String actual = lines[lines.length-1];

	    assertEquals(expected,actual);
	}
}
