

	public class Circle {
		 private Point center ;
		 private double radius ;
		 
		 
		 public Circle(Point center, double radius) {
			 this.center=center;
			 this.radius=radius;
			 
		 }
		 
		 public Point getCenter() {
			return center;
		}
		 
		 public String toString() {
			 return "le cercle est de centre"+ this.center+" , de rayon "+ this.radius + "et d'aire "+ this.area() ;
		 }
		 public void translate(int dx, int dy) {
		     this.center.translate(dx, dy);
			 
		 }
		 
		 public double area() {
			 return Math.PI*radius*radius;
		 }
		 
		 // on doit utiliser Pythagores theorem
		 public boolean contains(Point p) {
			 return Math.sqrt((p.getX()-center.getX())*(p.getX()-center.getX())+(center.getY()-p.getY())-(center.getY()-p.getY()))<=radius;
			 
		 }
		 
		 public boolean contains(Point p, Circle ...circles) {
			 
			 for(Circle c : circles) {
				 if (c.contains(p)) return true;
			 }
			 return false;
		 }

		}




