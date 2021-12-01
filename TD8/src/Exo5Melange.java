import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Exo5Melange <T extends Object> {
	
	public <T>List<T> melange(List<T> l, T x, T y) {
		int compteur=0;
		T tempx;
		T tempy;
		while (compteur<l.size()) {
			if (compteur==(int)x ||compteur==(int)y) {
				
				tempx=x;
				x=l.get(compteur);
				l.set(compteur, tempx);
				
				tempy=y;
				x=l.get(compteur);
				l.set(compteur, tempy);
				
			}
			
		}
		return l;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List list = new Arrays.asList(1,2,3,4,5);
	}

}
