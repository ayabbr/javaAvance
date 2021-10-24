
public class Point {

	private int x;
	private int y;
	private static int nbre=0;
	public int getX() {
		return x;
		
	}
	public int getY() {
		return y;
	}
	
	public void affichage() {
	Point p=new Point(2,3);
			
	System.out.println(p.x+" "+p.y);
	}
	public Point (int x, int y){
		this.x=x;
		this. y=y;
		this.nbre+=1;
	}
	
	public Point(Point p2) {
		this.x=p2.x;
		this.y=p2.y;
		this.nbre+=1;
	}
	
	/***** Pour le tp de GIT*****
	 * essai de voir les modifications
	 */
	/****/
	public String toString() {
		return "("+this.x +"," + this.y+")";
	}
	public boolean IsSameAs(Point p) {
		if ((this.x==p.x)&&(this.y==p.y)) {
			return true;
		}
		return false;
		
	}
	
	public void translate(int dx, int dy) {
		this.x=this.x+dx;
		this.y=this.y+dy;
		
	}
	
}

