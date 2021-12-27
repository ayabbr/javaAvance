
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Bag <E> implements Iterator<E>{
	/*
	 * a list to store the objects
	 */
	private List<E> obj;
	private Map<E, Integer> memory= new HashMap<>();	

	public static enum BagOrder{
	NATURAL(),//treemap
	INSERT,//linked hashmap
	ANY;//hash map;
	}
	public Bag(BagOrder o2) {
		this.obj=new ArrayList<>();
		switch(o2) {
		case NATURAL: memory=new HashMap<E,Integer>();
		case INSERT: memory=new TreeMap<E,Integer>();
		case ANY: memory=new LinkedHashMap<E, Integer>();

		}
		
	}
	
	public Bag() {
		this.obj=new ArrayList<>();	
		this.memory=new HashMap<>();
	}
	
	public void add(E e) {
		Integer occur = memory.get(e);
		Integer newOccur = 1;
	       if(occur!= null) {
	            newOccur += occur;
	        }
	        memory.put(e, newOccur);
		
		obj.add(e);
	}
	public void remove (E e) {
		Integer occur = memory.get(e);
		 if(occur != null) {
	            if(occur == 1){
	                memory.remove(e);
	            }
	            else if(occur > 1){
	                //on decremente le nombre d'occurence
	                occur--;
	                memory.put((E) e, occur);
	            }
		 }
		int index=obj.indexOf(e);
		obj.remove(index);
	}
	/*
	 * on renvoie le nombre d’occurrences de l’objet e dans la collection (0 si l’objet n’est pas
	 *dans le bag
	 */
	 public int count(E o) {
	        Integer occurence = memory.get(o);
	        if(occurence == null) 
	        	return 0;
	        else 
	        	return occurence;
	    }
	
	 public boolean contains(E element) {
	        return memory.containsKey(element);
	    }
	 
	  /**
	     * @return true if this bag is empty
	     */
	    public boolean isEmpty() {
	        return (obj.size() == 0) || memory.isEmpty();
	    }
	    
	    
	    public Iterator<Map.Entry<E,Integer>> iterator(){
			return  new Iterator<Map.Entry<E,Integer>>(){
				
				 // WE CREATE AN ITERATOR TO DELEGATE 
				Iterator<Map.Entry<E, Integer>> entryIterator = memory.entrySet().iterator();
		

                 public boolean hasNext() {

         			return entryIterator.hasNext();
                 }

                 public Entry<E, Integer> next() {
                	 return entryIterator.next();
                 }
			
			};
			
	    }

		@Override
		public boolean hasNext() {
			if(this.memory.isEmpty())
				return false;
			return memory.entrySet().iterator().hasNext();
		}

		@Override
		public E next() {
			return memory.entrySet().iterator().next().getKey();
		}
	    
	    
}
