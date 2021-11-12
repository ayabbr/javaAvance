
import java.util.AbstractList;
import java.util.Iterator;

public class Panel extends AbstractList<Integer>{
	
	private int bornInf,bornSup;
	
	public Panel(int lb, int up) {
		this.bornInf = lb;
		this.bornSup = up;
	}
	
	
	
	public static Iterator<Integer> panel1(final int borneinf, final int bornesup) {
		return new Iterator<Integer>() {
			private int i = borneinf;

			public boolean hasNext() {
				return (i <= bornesup);
			}

			public Integer next() {
				if (this.hasNext()) {
					return i++;
				};
				return null;
			}
		};
	}
	
	/*
	 * question 3: on doit implementer l'inteface Iterable
	 * 			  
	 */
	public static Iterable<Integer> panel2(final int borneinf, final int bornesup) {
		return new Iterable<Integer>() {
			public Iterator<Integer> iterator() {
				return panel1(borneinf, bornesup);
			}
		};
	}

	/*
	 * question 5: 
	 */
	
	public static AbstractList<Integer> panel(final int borneinf, final int bornesup) {
		if(borneinf > bornesup) throw new IllegalArgumentException() ; 
		
		return new AbstractList<Integer>() {
			@Override
			public Integer get(int index) {
				if (borneinf + index <= bornesup) {
					return borneinf + index;
				} else {
					throw new IndexOutOfBoundsException();
				}
			}

			@Override
			public int size() {
				return bornesup - borneinf +1;
			}
		};
	}

	
	

	@Override
	public Integer get(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
}
