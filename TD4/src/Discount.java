
public class Discount {
	private long value;
	
	public Discount(long value) {
		this.value=value;
	}
	public long getValue() {
		return value;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o== null)
			return false;
		if (getClass() != o.getClass())
			return false;
		Discount d = (Discount) o;
		return value == d.value;
	}
}
