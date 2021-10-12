
public class Expr {

double exp;
	
    Expr(double exp){
        this.exp=exp;
    }
    
    double eval(){
        return exp;
    }
    
    public double getExp() {
		return exp;
	}

	public void setTotal(double exp) {
		this.exp = exp;
	}
	
	@Override
	public String toString() {
		return "Expr [exp=" + exp + "]";
	}
	
    
}
