import les_autres_exercices_du_TD1.Circle;
import les_autres_exercices_du_TD1.IllegalArgumentException;
import les_autres_exercices_du_TD1.Object;
import les_autres_exercices_du_TD1.Override;
import les_autres_exercices_du_TD1.Point;
import les_autres_exercices_du_TD1.Ring;
import les_autres_exercices_du_TD1.String;

public class Ring extends Circle{

	private double inner_radius;
	
	public Ring(Point center, double radius, double inner_radius) {
		super( center,radius);
		
		if (inner_radius >= radius) {
			throw new IllegalArgumentException("rayon interne doit etre < rayon externe");
		} else {
			this.inner_radius=inner_radius;
		}
				
	}
	@Override
	public boolean equals(Object x) {
		if( x instanceof Ring) {
			Ring r = (Ring)x;
			return  (r.getCenter().equals(this.getCenter()) && r.inner_radius==this.inner_radius);
		}
		return false;
	}
	 
	@Override
	public String toString() {
		return super.toString() + "rayon interne = " + this.inner_radius;
				}
	
	@Override
	public boolean contains(Point p) {
		Circle cercleInterne = new Circle(this.getCenter(), this.inner_radius);
		if (cercleInterne.contains(p))
			return true;
		else
			return false;
	}

	public boolean contains(Point p, Ring... rings) {
		for(Ring r: rings) {
			if(r.contains(p)) return true;
		}
		return false;
	}
	

}
