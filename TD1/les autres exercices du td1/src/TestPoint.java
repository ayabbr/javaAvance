import java.util.ArrayList;
public class TestPoint {

	
	public void affichage() {
	Point p=new Point(5, 3);
			
	System.out.println(p.getX()+" "+p.getY());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(1,2);
		Point p2=p1;
		Point p3=new Point(1,2);
	    System.out.println(p1==p2);
		System.out.println(p1==p3);
		
	
		 ArrayList<Point> list = new ArrayList<>();
		 list.add(p1);
		 System.out.println(list.indexOf(p2));
		 System.out.println(list.indexOf(p3));
		 
		 System.out.println(p1.IsSameAs(p2));
		 System.out.println(p1.IsSameAs(p3));
	
	//exo5 question 5 on doit créer un autre point avec les meme coordonnées du point et l'associer au centre du cercle
	/*Point p=new Point(1,2);
	Point pCercle=new Point(1,2);
	Circle c=new Circle(p,1);
	Circle c2=new Circle(pCercle,2);
	  c2.translate(1,1);
	  System.out.println(c+" "+c2);  */
	  
	  // exo5 question 6
	 /* Circle c=new Circle(new Point(1,2), 1);
	  c.getCenter().translate(1,1);
	  System.out.println(c);**/
		 
	  //correction du probleme de la question 6:
		 
	  Circle c=new Circle(new Point(1,2), 1);
	  c.translate(1, 1);
	  System.out.println(c);
		 
	}
}
