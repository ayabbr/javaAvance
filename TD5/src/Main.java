import java.util.AbstractList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//question 1
		System.out.print("\n======== question 1========\n");
		Iterator<Integer> it = Panel.panel1(1, 5);
		for (;it.hasNext();) {
			System.out.println(it.next()); // affiche 1 2 3 4 5
		}
		
		System.out.print("\n======== question 3========\n");
		//question 3
		for (int i :Panel.panel2(1,5)) {
			System.out.println(i); // affiche 1 2 3 4 5
		}
		System.out.print("\n======= question 5=========\n");
		AbstractList<Integer> l = Panel.panel(3, 6);
		for (Integer itt : l) {
			System.out.println(itt);//affiche 3 4 5 6
		}
		System.out.print("\n");
		System.out.println(l.get(1)); // affiche 4
}
}
