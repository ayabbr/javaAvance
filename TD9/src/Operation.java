
public enum Operation {
	PLUS("+"),MINUS("-"),MULT("*"),DIV("/");
	private final String symbole; 
	
	private Operation(String c) {
		this.symbole=c;
	}

	public String getSymbole() {
		return symbole;
	}
	public double compute(double n1, double n2) {
		double result=0;
		
		switch(getSymbole()) {
			case("+"): result=n1+n2;break;
			case("-"): result=n1-n2;break;
			case("*"): result=n1*n2;break;
			case("/"): result=n1/n2;break;
		}
		return result;
	}
	
	@Override
	public String toString() {
		return getSymbole();
	}

	
}
