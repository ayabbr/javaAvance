import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exo4Fusion  {
	public static List<? extends CharSequence> fusion(List<? extends CharSequence> l1, List <? extends CharSequence> l2) {
		List<? extends CharSequence> l=new ArrayList();
		for (int i=0; i<l1.size();i++) {
			l.add(l1.get(i));
			l.add(l2.get(i));
			
		}
		return l;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1= Arrays.asList("C", "rc");
		List<StringBuilder> l2= Arrays.asList(new StringBuilder("a ma"), new StringBuilder("he!"));
		List<? extends CharSequence> r1=fusion(l1,l2);
		
		List<?> r2=fusion(l1,l2);
		List<Integer> l3 = Arrays.asList(1,2);
		List<Integer> l4 = Arrays.asList(10,20);
		List<Integer> r3 = fusion(l3,l4);
		List<?> r4 = fusion(l1,l3);
	}

}
