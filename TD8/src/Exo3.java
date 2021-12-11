import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Question 1 (a) TYPE T:

/*public class Exo3 <T>{
	
	private static <T extends CharSequence> ArrayList<Integer> listLength(List<T> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for (T elem : list) {
			length.add(elem.length());
		}
		return length;
	}
		} **/
// QUESTION 2 : wildcard
public class Exo3 {
	
	public static List<?> listLength(List<? extends CharSequence> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for(int i=0; i<list.size();i++) {
			CharSequence seq = list.get(i);
			length.add(seq.length());
		}
		return length;
	
	}

	public static void main(String[] args) {
		List l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
}
	
}