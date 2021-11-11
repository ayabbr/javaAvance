import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GarageTest {

	@Test
	public void firstCarByBrand() {
		Car c1 = new Car("BMW", 250000);
		Car c2 = new Car("Lada", 65000);
		
		Garage garage = new Garage();
		garage.add(c1);
		garage.add(c2);
		
		assertSame(c1, garage.firstCarByBrand("BMW"));
		assertSame(c2, garage.firstCarByBrand("Lada"));
	}

	public void testCarNull() {
		Garage garage = new Garage();
		assertThrows(NullPointerException.class, () -> garage.add(null));
		
	}
}
