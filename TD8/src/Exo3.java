import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Question 1 (a) :

/*public class Exo3 <T>{
	
	public static <T> ArrayList<T> listLength(List<T> list) {
		ArrayList length=new ArrayList();
		for(int i=0;i<list.size();i++) {
		CharSequence seq=(CharSequence)list.get(i);
		length.add(seq.length());
		}
		return length;
		} **/
public class Exo3 {
	
	public static <T> ArrayList<T> listLength(List<?> list) {
		ArrayList length=new ArrayList();
		for(int i=0;i<list.size();i++) {
		CharSequence seq=(CharSequence)list.get(i);
		length.add(seq.length());
		}
		return length;
		}

	public static void main(String[] args) {
		List l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l));
}
	
}