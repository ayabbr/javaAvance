import java.util.Objects;


public class Car extends Vehicule {
	
	private int vetuste;
	
	public Car(String brand, long value) {
		// TODO Auto-generated constructor stub
		super(brand, value,null);
		
		this.vetuste=0;
	}
	
	public Car(String brand, long value, int vetuste) {
		
		super(brand, value,null);
		
		this.vetuste=vetuste;
	}
public Car(String brand, long value, int vetuste,Discount discount) {
		
		super(brand, value,discount);
		
		this.vetuste=vetuste;
	} 

	
	public int getVetuste() {
		return vetuste;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return super.toString()+" et de véstusté "+this.vetuste;
	}
	
	
	public boolean equals(Car c) {
		if (c.getBrand().equals(super.getBrand()) && c.getValue()==super.getValue() && c.vetuste==this.vetuste) {
			return true;
		}
		return false;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null)return false;
		if (getClass() != o.getClass()) return false;
		Car c = (Car) o;
		return Objects.equals(this.getBrand(), c.getBrand()) && this.getValue() == c.getValue() && vetuste == c.vetuste;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getBrand(), this.getValue(), vetuste);
	}

}

// Pour exercice 1 et 2
/**
public class Car  {
	private final String brand;
	private final long value;
	private int vetuste;
	
	public Car(String brand, long value) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		if (value<0) {
			throw new IllegalStateException("value ne peut pas etre negative");
		}
		else this.value=value;
		
		this.vetuste=0;
	}
	public Car(String brand, long value, int vetuste) {
		this.brand=brand;
		if (value<0) {
			throw new IllegalStateException("value ne peut pas etre negative");
		}
		else this.value=value;
		
		this.vetuste=vetuste;
	}

	public String getBrand() {
		return brand;
	}
	

	public long getValue() {
		return value;
	}
	
	public int getVetuste() {
		return vetuste;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return " voiture de marque "+brand + " , de valeur "+value+" et de véstusté "+this.vetuste;
	}
	
	
	public boolean equals(Car c) {
		if (c.brand.equals(brand) && c.value==this.value && c.vetuste==this.vetuste) {
			return true;
		}
		return false;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null)return false;
		if (getClass() != o.getClass()) return false;
		Car c = (Car) o;
		return Objects.equals(this.getBrand(), c.getBrand()) && this.getValue() == c.getValue() && vetuste == c.vetuste;
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.getBrand(), this.getValue(), vetuste);
	}

}
**/
