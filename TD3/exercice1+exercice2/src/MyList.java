import java.util.LinkedList;

public class MyList {
	
private Cell racine;

public MyList(Cell racine){
	this.racine=racine;
}

public MyList(){
	this.racine=null;
}

public void add(String s) {
	
Cell c=  new Cell(s, racine);
}

public int size() {
	int nbre=0;
	
	Cell c= racine;
	
	while (c.getNext()!=null) {
		nbre++;
		c=c.getNext();
	}
	return nbre;
}

public String toString() {
	Cell c=racine;
	String s="";
	while (c.getNext()!=null) {
		s=s+c.getStr() +", ";
		c=c.getNext();
	}
	return s ;
			
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
            return "Invalid";
		else {
		Cell c=racine;
		int indice=0;
		
	    while (c.getNext()!=null && indice!=index) {		
		      c=c.getNext();
		      indice++;
	           }
	   return c.toString();
	}
		}
	
	public int sumLetters() {
		int somme=0;
		Cell c=racine;
		int indice=0;
		
	    while (c.getNext()!=null) {
	    	
	    	//somme+=c.getStr().length();
	    	somme+=c.toString().length();
		      c=c.getNext();
		      indice++;
		      
	           }
		return somme;
	}


}
