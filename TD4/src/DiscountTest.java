import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DiscountTest {

	@Test
	void getValuetest() {
		Discount t = new Discount(1500);
		assertEquals(1500, t.getValue());
	}

}
