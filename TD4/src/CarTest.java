import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {

	@Test
	public void BrandTest() {
		Car car  = new Car("BMW", 100000);
		assertEquals("BMW", car.getBrand());
	}

	@Test
	public void getValueTest() {
		Car car  = new Car("Lada", 65000);
		assertEquals(12000, car.getValue());
	}

	@Test
	public void VetusteTest() {
		Car car  = new Car("Tesla", 555000, 2);
		assertEquals(10000, car.getValue());
	}
	@Test
	public void testInvalidValue() {
		assertThrows(IllegalArgumentException.class, () -> new Car("Tesla", -3));
	}

}
