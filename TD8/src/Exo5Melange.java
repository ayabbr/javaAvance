
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class Exo5Melange {
	
	public static <E> void swap(List<?> list, int x, int y) {
		try{
			Collections.swap(list, x, y);
		}
		catch(Exception e) {
			throw new IllegalArgumentException();
		}
	}

	//complexite de shuffle est de 
	public static <T> void shuffle(List<T> list) {
		Random r = new Random(); 
		for (int i = list.size()-1; i>0;i--) {
			int j = r.nextInt(i);
			T temp = list.get((int) i); 
            list.set(i, list.get(j)); 
            list.set(j, temp);
		}
		 Print.print(list);
	}
	
	public static void main(String[] args) {
		List<?> list=  Arrays.asList(1,2,3,4,5,6,7,8);
		swap(list,3,4);
		Print.print(list); // 1 2 3 5 4 6 7 8
		
		List<?> list2=  Arrays.asList("toto","tata","titi");
		swap(list2,2,0);
		Print.print(list2); // titi tata toto
		// oui c'est possible
		
		System.out.println("====== shuffle 2======");
		shuffle(list);
		
	}

}
