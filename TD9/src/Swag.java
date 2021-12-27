import java.util.StringJoiner;

	public class Swag {
		public enum STYLE{
			CROSS, KIKOO;
		}
		final static int CROSS=1;
		final static int KIKOO=2;

		public static String swag(String txt, int style) {
			String[] newStr=txt.split("");
			StringJoiner sj= new StringJoiner("");
			
			switch (style) {
			case(CROSS): 
				for(int i=1; i<newStr.length;i++) {
					newStr[i]= '+'+newStr[i];
				};
				for(String str: newStr)
					sj.add(str);
				break;
			case(KIKOO): 
				for(int i=0; i<newStr.length;i++) {
					if(i%2==0)
						newStr[i]=newStr[i].toUpperCase();
				};
				for(String str: newStr)
					sj.add(str);
				break;
			case CROSS|KIKOO:
				for(int i=0; i<newStr.length;i++) {
					if(i%2==0)
						newStr[i]=newStr[i].toUpperCase();					
					}
				for(int i=1; i<newStr.length;i++)
					newStr[i]= '+'+ newStr[i];
				for(String str: newStr)
					sj.add(str);
				break;
				};
			return sj.toString();
			
		}
		
		public static void main(String[] args) {
			
		//Exercise 2 SWAG
			String txt="miage";
		//test for the CROSS +
		System.out.println(swag(txt, CROSS));//m+i+a+g+e
		
		//test for the upper or lower 
		System.out.println(swag(txt, KIKOO));//MiAgE
		
		//test for the combination of the two cases binded
		
		System.out.println(swag(txt,KIKOO|CROSS)); //M+i+A+g+E
		}
	}
