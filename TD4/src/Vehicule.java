import java.util.Comparator;
public class Vehicule  {
	
	private final String brand;
	private final long value;
	private Discount discount;
	
	public Vehicule(String brand, long value, Discount discount) {
		// TODO Auto-generated constructor stub
		this.brand=brand;
		if (value<0) {
			throw new IllegalStateException("value ne peut pas etre negative");
		}
		else this.value=value;
		this.discount=discount;
		
	}
	
	public String getBrand() {
		return brand;
	}
	

	public long getValue() {
		return value;
	}
	public Discount getDiscount() {
		return discount;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return " véhicule de marque "+brand + " , de valeur "+value;
	}
	
	//Comparaison par nom de la marque
	public static Comparator<Vehicule> ComparatorMarque = new Comparator<Vehicule>() {
	      
        @Override
        public int compare(Vehicule e1, Vehicule e2) {
            return e1.getBrand().compareTo(e2.getBrand());
        }
    };

	
}
