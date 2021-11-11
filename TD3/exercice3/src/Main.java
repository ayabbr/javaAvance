import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Map<Point, Circle> m = new HashMap<>();
Point p1 = new Point(100,150);
Circle c1 = new Circle(p1,100);
m.put(p1, c1);
System.out.println(m.containsKey(p1)); // true

System.out.println(m.containsKey(new Point(100,200))); //false
	}

}
