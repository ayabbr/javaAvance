
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Bag2 <E> implements Set<E>{
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
	public Bag2(BagOrder o2) {
		this.obj=new ArrayList<>();
		switch(o2) {
		case NATURAL: memory=new HashMap<E,Integer>();
		case INSERT: memory=new TreeMap<E,Integer>();
		case ANY: memory=new LinkedHashMap<E, Integer>();

		}
		
	}
	
	public Bag2() {
		this.obj=new ArrayList<>();	
		this.memory=new HashMap<>();
	}
	
	@Override

	public boolean add(E e) {
		Integer occur = memory.get(e);
		Integer newOccur = 1;
	       if(occur!= null) {
	            newOccur += occur;
	        }
	        memory.put(e, newOccur);
		
		return obj.add(e);
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
	
	 @Override
	 public boolean contains(Object element) {
	        return memory.containsKey(element);
	    }
	 
	  /**
	     * @return true if this bag is empty
	     */
	    public boolean isEmpty() {
	        return (obj.size() == 0) || memory.isEmpty();
	    }
	    
	    
	    public Iterator<E> iterator(){
			return  new Iterator<E>(){
				
				 // WE CREATE AN ITERATOR TO DELEGATE 
				Iterator<Map.Entry<E, Integer>> entryIterator = memory.entrySet().iterator();
		

                 public boolean hasNext() {

         			return entryIterator.hasNext();
                 }

                 public E next() {
                	 return entryIterator.next().getKey();
                 }
			
			};
			
	    }
		@Override
		public boolean addAll(Collection<? extends E> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		

		@Override
		public boolean containsAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> arg0) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] arg0) {
			// TODO Auto-generated method stub
			return null;
		}
}
	    
	    

