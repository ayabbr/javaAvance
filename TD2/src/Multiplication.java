
public class Multiplication extends Expr{
private Value val1;
	Multiplication(Value val1, Expr val2) {
			super(val2.eval());
			this.val1 = val1;
		}
public double eval() {
		
	double t = super.eval() * val1.eval();
		
		return t;
	}
@Override
public String toString() {
	return "Mult [val1=" + val1 + ", val2=" + super.exp + "]";
}

	

}
