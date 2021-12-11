import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Exo4Fusion  {
	public static <T> ArrayList<T> fusion(List<? extends T> l1, List<? extends T> l2) {
		Iterator<? extends T> t1 = l1.iterator();
		Iterator<? extends T> t2 = l2.iterator();
		ArrayList<T> fusion = new ArrayList<T>();
		try{
				while (t1.hasNext()) {
				fusion.add(t1.next());
				fusion.add(t2.next());
			}
			return fusion ; 
		}catch(Exception e){
			throw new IllegalArgumentException("les deux listes sont vides");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<?> r4 = fusion(l1,l3);
	}

}
