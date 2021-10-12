
public class Sqrt extends Expr {

	private Value val1;
	
	Sqrt(Value val1, Expr val2) {
			super(val2.eval());
			this.val1 = val1;
		}
	
	public double eval() {
		
		double t = super.eval() * Math.sqrt(val1.eval());
			
			return t;
		}

}
