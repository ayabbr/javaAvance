
public class Account {
	
		private int val;
		private String oper;
		
		public static void main(String[] args) {
			
		 final Account acc=new Account();
		 
		Thread retrait = new Thread(new Runnable() {
		@Override
		
		public void run() {
		for(int i=0;i<5000;++i) {
			synchronized(acc) {
		acc.oper = "retrait";
		acc.val = 50;
		System.out.println(acc.oper + " " + acc.val + "euros");
		 }
		  }
		}
		});
		
		Thread depot = new Thread(new Runnable() {
			
		@Override
		public void run() {
		for(int i=0;i<5000;++i) {
			synchronized(acc) {
		acc.oper = "depot";
		acc.val = 100;
		System.out.println(acc.oper + " " + acc.val + "euros");
		}
		}
		}
		});
		retrait.start();
		depot.start();
		}
		}