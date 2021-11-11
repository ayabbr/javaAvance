
public class MyListGeneric <T>{
	private CellGeneric <T> racine;
	private int size;

	public MyListGeneric (CellGeneric <T> racine){
		this.racine=racine;
	}

	public MyListGeneric(){
		this.racine=null;
	}

	public void add(T s) {
		
	racine=  new CellGeneric <T>(s);
	  if (s==null) {
		  throw new NullPointerException(" contenu ne peut pas etre null");
	  }
	  
	}

	/**
	 * 
	 
	 
	
	public int size() {
		int nbre=0;
		
		CellGeneric c= racine;
		
		while (c.getNext()!=null) {
			nbre++;
			c=c.getNext();
		}
		return nbre;
	}*/
	public int size() {
		return this.size;}
	

	public String toString() {
		CellGeneric<T>c=racine;
		StringBuilder s=new StringBuilder();
		
		while (c.getNext()!=null) {
			//s=s+c.getStr() +", ";
			s.append(c.getStr()).append(",");

			c=c.getNext();
		}
		return s.toString() ;
				
	}

	public void addLast(T s) {
		if (racine==null) {
		    racine= new CellGeneric<T>(s);}
		else {
		     CellGeneric <T> c=racine;
		     while (c.getNext()!=null) {		
			      c=c.getNext();
		         }
		    CellGeneric<T> LastCell=new CellGeneric<T>(s);
		    c.setNext(c);
	          }
		this.size++;
	}

	public void add(T s, int i) {
		CellGeneric<T >c=racine;
		int indice=0;
		
	    while (c.getNext()!=null && indice!=i) {		
		      c=c.getNext();
		      indice++;
	           }
	    
	  CellGeneric <T>nexti= new CellGeneric<T> (s);
			  c.setNext(nexti);
			  
			  this.size++;
	     }
		

		public T get(int index) {
			
			if(index>size())
				throw new IllegalArgumentException("Invalid");
			else {
			CellGeneric<T> c=racine;
			int indice=0;
			
		    while (c.getNext()!=null && indice!=index) {		
			      c=c.getNext();
			      indice++;
		           }
		   return c.getStr();
		}
			}
		public boolean contains(Object o) {
			CellGeneric <T> c=racine;
			while (c.getNext()!=null) {	
				if(c.getStr().equals(o)) return true;
			      c=c.getNext();
			    
		           }
			
			return false;
		}

		public int sumLetters() {
			int somme=0;
			CellGeneric <T> c=racine;
			
			
		    while (c.getNext()!=null) {
		    	if(c.getStr() instanceof String) {
		    		
		    	somme+=((String)c.getStr()).length();
		    	}
		    	
			      c=c.getNext();
			     
			      
		           }
			return somme;
		}
}
