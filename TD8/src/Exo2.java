import java.util.Arrays;
import java.util.List;

public  class Exo2 <T extends Object> {

	private static void print(List <? extends Object> list) {
		for( Object o:list)
		System.out.println(o);
		}
	
	public static void longueur(List< ? extends CharSequence> list) {
		int i=0;
		for( Object o:list) {
			System.out.println("la longeur de l'objet"+i+1+ "="+ o.toString().length());
		i++;
			}
	}


		public static void main(String[] args) {
		List<String> list=Arrays.asList("foo", "toto");
		print(list);
		longueur(list);
		}
}