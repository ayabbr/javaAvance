import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarTest2 {

	@Test
	public void testEquals() {
		Car c1 = new Car("BMW", 100000);
		Car c2 = new Car("BMW", 100000);
		assertTrue(c1.equals(c2));
	}
	
	@Test
	public void testEquals2() {
		Car c = new Car("BMW", 100000);
		assertFalse(c.equals(new String()));
	}

}
