import static org.junit.Assert.*;

import org.junit.Test;

import  Swag2.STYLE;

import java.util.EnumSet;
import java.util.LinkedHashSet;


public class Swag2Test {

	@Test
	public void testCross() {
		assertEquals("m+i+a+g+e", Swag2.swag("miage", EnumSet.of(STYLE.CROSS)));
	}

	@Test
	public void testKikoo() {
		assertEquals("MiAgE", Swag2.swag("miage", EnumSet.of(STYLE.KIKOO)));
	}

	@Test
	public void testCombo() {
		LinkedHashSet<STYLE> hs = new LinkedHashSet<Swag2.STYLE>();
		hs.add(STYLE.KIKOO);
		hs.add(STYLE.CROSS);
		assertEquals("M+i+A+g+E", Swag2.swag("miage", hs));
	}

}
