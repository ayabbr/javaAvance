import java.util.Scanner;
public class Exercice2 {
	protected static Object monitor = new Object();


	public static Runnable creation(int id) throws InterruptedException {
		return new Runnable() {
			@SuppressWarnings("resource")
			@Override
			public void run() {
				int i=0;
				//while (true) to turn it infinite
				while(i<10) {
						synchronized(monitor ) {
//							Thread.currentThread().setName(""+id);
							System.out.println("Thread : "+id+" iteration num : "+i);
							i++;
							if(Thread.currentThread().isInterrupted()){
					    		
								Scanner sc = new Scanner(System.in);
//					    		System.out.println(Thread.currentThread().getName());
					    		System.out.print("entrez l'id du thread a interrompre: \t");
					    		int inter= sc.nextInt();
					    		if(inter==id)
				                 {
					    			Thread.currentThread().interrupt();
					                System.out.println("INTERUPTION DU THREAD ");
					                break; 
					               }
				                }
							
							}
						}
				
						
					}
				
				
		};
	}
	
	
    public static void main( String[] args ) throws InterruptedException
    {
    		Scanner sc = new Scanner(System.in);
    		System.out.print("entrez le nombre de thread à créer: \t");
    		int numberOfThreads= sc.nextInt();
            int i=1;
            for (int n = 0; n < numberOfThreads; n++) {
                Thread t = new Thread(creation(i));
                i++;
                t.start();
                t.interrupt();
                t.join();
               
            }
            System.out.println("Fin du Thread"); 
            sc.close();
   }
}
