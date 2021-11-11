import java.util.Objects;

public class Bike extends Vehicule {

	
	private static long value=100;
	
	public Bike(String brand, Discount discount) {
		// TODO Auto-generated constructor stub
		super(brand, value,discount);
		
	}
	public Bike(String brand) {
		this(brand, null);
	}
	public  long getValue() {
		if (super.getDiscount() != null) {
			return super.getDiscount().getValue();
		}
		return value;
	}
	public String toString() {
		// TODO Auto-generated method stub
		
		return super.toString();
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Bike b = (Bike) o;
		return Objects.equals(super.getBrand(), b.getBrand());
	}
}

