import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;



class GarageTest2 {

	@Test
	public void Remove() {
		Garage garage = new Garage();
		garage.add(new Car("BMW", 100000));
		garage.remove(new Car("BMW", 100000));
		assertNull(garage.firstCarByBrand("BMW"));
	}

	

}
