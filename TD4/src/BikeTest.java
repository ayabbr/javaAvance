import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BikeTest {

	@Test
	public void TestEquals() {
		Bike bike1 = new Bike("Scott");
		assertEquals(bike1, new Bike("Scott"));
	}
	
}
