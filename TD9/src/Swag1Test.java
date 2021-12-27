import static org.junit.Assert.*;

import org.junit.Test;

	public class Swag1Test {

		@Test
		public void testKikouInt() {
			assertEquals("MiAgE", Swag.swag("miage", Swag.KIKOO));
		}

		@Test
		public void testComboInt() {
			assertEquals("M+i+A+g+E", Swag.swag("miage", Swag.CROSS|Swag.KIKOO));
		}

	}
