package model;
import java.util.ArrayList;

public class Model {
	
	public ArrayList<Shape> shapes;
	
	public Model() {
		shapes = new ArrayList<Shape>();
		
shapes.add(new Circle(new Point(100,50),50));
		
		shapes.add(new Point (50,50));
		
		shapes.add(new Circle (new Point(300,100),100));
	
	}
	
	public ArrayList<Shape> getShapes() {
		return shapes;
	}

}
