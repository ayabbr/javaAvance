
public class Exercice1 extends Thread{

		protected static Object monitor = new Object();


		public static Runnable creation(int id) {
			return new Runnable() {
				@Override
				public void run() {
					int i=0;
					//while (true) to turn it infinite
					while(i<10) {
						synchronized(monitor ) {
							System.out.println("Thread : "+id+" iteration nÂ° "+i);
							i++;
						}
					}
				}
			};
		}
		
		// Question 2 :les itération sont effectué dans l'ordre de l'ordonnanceur qui peut  couper l'execution d'un thread lors de l'execution d'un thread on peut donc se retrouver avec un nombre indeterminée d'iteration
	    public static void main( String[] args )
	    {
	    	Thread th1= new Thread(creation(1));
			Thread th2= new Thread(creation(2));
			th1.start();
			th2.start();

	    }
	}

