
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Print {
	
	
//	private static <T> void print(List<T> list) {
//		for(T o : list) {
//			System.out.println(o);
//		}
//	}
	public static  void print(List<?> list) {
		for(Object o:list)
		System.out.println(o);
	}
	/**
	 * we want our function to print any object even a list of Integer 
	 * @param <T>
	 * @param list of object
	 */
	public static <T extends CharSequence> void printCharSequence(List<T> list) {
		for(T o : list) {
			System.out.println(o.length());
		}
	}
	
	//utiliser les wildcard
	public static List<?> listLength(List<? extends CharSequence> list) {
		ArrayList<Integer> length = new ArrayList<Integer>();
		for(int i=0; i<list.size();i++) {
			CharSequence seq = list.get(i);
			length.add(seq.length());
		}
		return length;
	}
	
	//rendre generique la fonction listLength avec T 
	
	private static <T extends CharSequence> ArrayList<Integer> listLengthh(List<T> list) {
		ArrayList<Integer> ret = new ArrayList<Integer>();
		for (T elem : list) {
			ret.add(elem.length());
		}
		return ret;
	}
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("foo","toto");
		print(list);//foo then toto
		printCharSequence(list);// 3 then 4
		
	
		List l=Arrays.asList("colonel", "reyel");
		System.out.println(listLength(l)); //affiche [7, 5]
		System.out.println(listLengthh(l));// same
	}
	
}

