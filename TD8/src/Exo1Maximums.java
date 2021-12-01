// exercice1
public class Exo1Maximums <T extends Comparable>{
	
	
	// 1. la signature de la méthode doit etre public static int  myMax(Object... y)
/**
 * Question1
 * 
 * public static int  myMax(Object... y) {
	int max=(int) y[0];
	
	for(int i=1;i<y.length;i++) {
		if ((int)y[i]>max) {
			max=(int)y[i];
		}
	}
	return max;
}
 **/
	
//Question4
public static <T extends Comparable> Object myMax(Comparable ...y){
	Comparable max= y[0];
	int result=0;
	for(int i=1;i<y.length;i++) {
		 result=y[i].compareTo(max);
		 if (result==1){
			max=y[i];
}
		}
	return max ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(myMax(42,1664)); //1664
		System.out.println(myMax(2014,86,13)); //2014
		
		System.out.println(myMax(8.6,16.64)); //16.64
		System.out.println(myMax("Denis", "Cornaz")); //Denis
		System.out.println(myMax(8.6, "Denis"));//ne doit pas compiler !
	}

}
