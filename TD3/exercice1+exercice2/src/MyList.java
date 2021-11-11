

public class MyList {
	
private Cell racine;
private int size;

public MyList(Cell racine){
	this.racine=racine;
}

public MyList(){
	this.racine=null;
	this.size=0;
}

public void add(String s) {
	Cell c= new Cell(s, racine);
	if (s==null) {
		 throw new NullPointerException(" contenu ne peut pas etre null");
	}
	c.setNext(racine);
    racine= c;
    this.size++;

}

/**public int size() {
	int nbre=0;
	
	Cell c= racine;
	
	while (c.getNext()!=null) {
		nbre++;
		c=c.getNext();
	}
	return nbre;
} **/

public int size() {
	return this.size;}


public String toString() {
	Cell c=racine;
	StringBuilder s=new StringBuilder();
	
	while (c.getNext()!=null) {
		//s=s+c.getStr() +", ";
		s.append(c.getStr()).append(",");

		c=c.getNext();
	}
	return s.toString() ;
			
}

public void addLast(String s) {
	if (racine==null) {
	    racine= new Cell(s, null);}
	else {
	     Cell c=racine;
	     while (c.getNext()!=null) {		
		      c=c.getNext();
	                               }
	    Cell LastCell=new Cell(s, null);
	    c.setNext(c);
          }
}

public void add(String s, int i) {
	Cell c=racine;
	int indice=0;
	
    while (c.getNext()!=null && indice!=i) {		
	      c=c.getNext();
	      indice++;
           }
    
  Cell nexti= new Cell (s,c.getNext());
		  c.setNext(nexti);
     }
	

	public String get(int index) {
		//si l'indice est invalide on fait un test et on retourne un message d'erreur
		if(index>size())
           // return "Invalid"; // throw new index out of Bound();
			throw new IllegalArgumentException("Invalid");
		else {
		Cell c=racine;
		int indice=0;
		
	    while (c.getNext()!=null && indice!=index) {		
		      c=c.getNext();
		      indice++;
	           }
	   return c.getStr();
	}
		}
	
	public int sumLetters() {
		int somme=0;
		Cell c=racine;
		
		
	    while (c.getNext()!=null) {
	    	
	    	somme+=c.getStr().length();
	    	
		      c=c.getNext();
		   
		      
	           }
		return somme;
	}


}
