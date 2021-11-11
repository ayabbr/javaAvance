import java.util.ArrayList;
import java.util.HashSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		Bike bike1= new Bike("scot");
		Bike bike2= new Bike("merlin");
		Garage g=new Garage();
		g.add(a);
		g.add(b);
		g.add(c);
		g.add(bike1);
		g.add(bike2);
		
		System.out.println(g.toString());
		g.remove(a);
		System.out.println(g.toString());
		g.add(a);
		System.out.println(g.toString());
		g.protectionism("BMW");
		System.out.println(g.toString());
		
		// Test de l'exercice 1 et 2
		/**
		Car a = new Car("Audi",10000);
		Car b = new Car("BMW",9000);
		Car c = new Car("BMW",9000);
		Car d = a;
		System.out.println(a==b);
		System.out.println(b==c);
		System.out.println(a==d);
		System.out.println(a.equals(b));
		System.out.println(b.equals(c)); // ici normalement l'affichage doit etre true 
		System.out.println(a.equals(d));
	
		ArrayList<Car> list = new ArrayList<>();
		list.add(a);
		list.add(b);
		System.out.println(list.indexOf(a));
		System.out.println(list.indexOf(b));
		System.out.println(list.indexOf(c)); // il a afficher -1 car c n'est pas dans la liste mais normalement il doit afficher 1 puisque b et c on le meme contenu
		System.out.println(b.equals(c));
		
		HashSet<Car> set = new HashSet<Car>();
		set.add(b);
		System.out.println(set.contains(c)); // normalement ça doit retourner true et non pas false
**/
}
}