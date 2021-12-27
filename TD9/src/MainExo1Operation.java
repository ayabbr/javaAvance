
public class MainExo1Operation {

public static void main(String[] args) {
		
		//		test the printing setting
		Operation p= Operation.PLUS;
		System.out.println(p.getSymbole());//+
		
		Operation p1= Operation.MINUS;
		System.out.println(p1.getSymbole());//-
		
		//ON TESTE L OPERATION COMPUTE
		System.out.println(Operation.PLUS.compute(3,4));
		
		
				
	}

}
