import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GarageTest3 {

	@Test
	public void Testprotectionism() {
		Garage garage = new Garage();
		garage.add(new Car("BMW", 2020));
		garage.add(new Car("BMW", 2010));
		garage.add(new Car("Range", 100000));
		garage.protectionism("BMW");
		assertEquals(garage.getId(), 100000);
	}

}
