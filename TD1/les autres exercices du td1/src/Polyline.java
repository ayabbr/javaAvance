
import java.util.Objects;
import java.util.LinkedList;
public class Polyline {
	//private Point[] tab ;
	//private int maxp;
	
	private LinkedList <Point> lp;
	
	public Polyline() {
		this.lp= new LinkedList <Point>();
	}
	

	public void add(Point p) {
		Point po = Objects.requireNonNull(p);
		if(po==null	) return ;
		lp.add(p);
		}
		
	
	public int nbPoints() {
		return lp.size();
	
	}

	public boolean contains(Point p) {
		Point po = Objects.requireNonNull(p);
	if(po==null	) return false;
		
	return(lp.contains(p)); 
				
	}
	
	// le code ci-dessous concerne les questions avant la question 6 de l'exo 4
	
	/*
	public Plyline(int maxp) {
		this.maxp=maxp;
		this.tab= new Point[this.maxp];
		
	}
	
	public void add(Point p) {
		Point po = Objects.requireNonNull(p);
		if(po==null	) return ;
		for(Point point : tab) {
			if (p==null) {
				point=p;
			}
		}
	}
	
	public int pointCapacity() {
		return maxp;
	}
	 public int nbPoints() {
		 int nb=0;
		 for(Point p : tab) {
			 if(!(p==null)) nb++;
		 }
		 return nb;
	 }
	
	public boolean contains(Point p) {
		Point po = Objects.requireNonNull(p);
	if(po==null	) return false;
		
		for(Point point : tab) {
			if(p.equals(point)) 
				return true;
		}
		return false;
	}*/
	
}
