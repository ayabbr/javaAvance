
public class MyListGeneric {
	private CellGeneric racine;

	public MyListGeneric (CellGeneric racine){
		this.racine=racine;
	}

	public MyListGeneric(){
		this.racine=null;
	}

	public void add(Object s) {
		
	racine=  new CellGeneric(s, racine);
	}

	public int size() {
		int nbre=0;
		
		CellGeneric c= racine;
		
		while (c.getNext()!=null) {
			nbre++;
			c=c.getNext();
		}
		return nbre;
	}

	public String toString() {
		CellGeneric c=racine;
		String s= null;
		while (c.getNext()!=null) {
			s=s+c.getStr() +", ";
			c=c.getNext();
		}
		return s ;
				
	}

	public void addLast(Object s) {
		if (racine==null) {
		    racine= new CellGeneric(s, null);}
		else {
		     CellGeneric c=racine;
		     while (c.getNext()!=null) {		
			      c=c.getNext();
		                               }
		    CellGeneric LastCell=new CellGeneric(s, null);
		    c.setNext(c);
	          }
	}

	public void add(String s, int i) {
		CellGeneric c=racine;
		int indice=0;
		
	    while (c.getNext()!=null && indice!=i) {		
		      c=c.getNext();
		      indice++;
	           }
	    
	  CellGeneric nexti= new CellGeneric (s,c.getNext());
			  c.setNext(nexti);
	     }
		

		public Object get(int index) {
			
			if(index>size())
	            return "Invalid";
			else {
			CellGeneric c=racine;
			int indice=0;
			
		    while (c.getNext()!=null && indice!=index) {		
			      c=c.getNext();
			      indice++;
		           }
		   return c.toString();
		}
			}
		public boolean contains(Object o) {
			CellGeneric c=racine;
			while (c.getNext()!=null) {	
				if(c.getStr().equals(o)) return true;
			      c=c.getNext();
			    
		           }
			
			return false;
		}

		public int sumLetters() {
			int somme=0;
			CellGeneric c=racine;
			
			
		    while (c.getNext()!=null) {
		    	if(c.getStr() instanceof String) {
		    		
		    	somme+=((String)c.getStr()).length();
		    	}
		    	
			      c=c.getNext();
			     
			      
		           }
			return somme;
		}
}
