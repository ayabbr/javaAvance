
public class Value extends Expr {

	
	 Value(double exp){
	        super(exp);
	    }
	    double eval(){
	        return exp;
	    }
	    @Override
		public String toString() {
			return "Value [exp=" + exp + "]";
		}
}
