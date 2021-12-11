import java.util.Arrays;
import java.util.List;

public  class Exo2 <T extends Object> {

	private static void print(List<?> list) {
		for( Object o:list)
		System.out.println(o);
		}
	
	public static  <T extends CharSequence> void longueur(List<T> list) {
		for(T o : list) {
			System.out.println(o.length());
		}
	}


		public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		longueur(list);
		}
}