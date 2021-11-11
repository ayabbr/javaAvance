
public class CellGeneric <T>  {
	private	 T str;
	
	private	CellGeneric<T> next;
		
		public CellGeneric(T s ) {
			
			this.str=s;
			this.next=null;
			
		}
		
		public T getStr() {
			return str;
		}
		public void setStr(T str) {
			this.str = str;
		}
		
		public CellGeneric<T> getNext() {
			return next;
		}
		public void setNext(CellGeneric<T> next) {
			this.next = next;
		}
}
