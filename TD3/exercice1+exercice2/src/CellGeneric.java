
public class CellGeneric {
	private	Object str;
	
	private	CellGeneric next;
		
		public CellGeneric(Object str, CellGeneric next) {
			
			this.str=str;
			this.next=next;
			
		}
		
		public Object getStr() {
			return str;
		}
		public void setStr(String str) {
			this.str = str;
		}
		
		public CellGeneric getNext() {
			return next;
		}
		public void setNext(CellGeneric next) {
			this.next = next;
		}
}
