
import java.util.EnumSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.StringJoiner;


public class Swag2 {
	public enum STYLE{
		CROSS {
			@Override
			String applyStyle(String txt) {
				String[] newStr=txt.split("");
				StringJoiner sj= new StringJoiner("");
				
				for(int i=1; i<newStr.length;i++) {
						newStr[i]= '+'+newStr[i];
					}
				for(String str: newStr)
						sj.add(str);
				return sj.toString();
				}
		}, KIKOO {
			@Override
			String applyStyle(String txt) {
				String[] newStr=txt.split("");
				StringJoiner sj= new StringJoiner("");
				for(int i=0; i<newStr.length;i++) {
					if(i%2==0)
						newStr[i]=newStr[i].toUpperCase();
				}
				for(String str: newStr)
					sj.add(str);
				return sj.toString();
			}
		};
		abstract String applyStyle(String txt);
		
	};
	
	//to do correct the bugs 
	public static String swag(String txt, EnumSet<STYLE> style) {
		String ret = "";
		if(style.contains(STYLE.CROSS)) 
				ret= STYLE.CROSS.applyStyle(txt);
		if(style.contains(STYLE.KIKOO)) 
				ret= STYLE.KIKOO.applyStyle(txt);
		return ret;
		}
	
	public static String swag(String txt, LinkedHashSet<STYLE> hs) {
		Iterator<STYLE> iterate = hs.iterator();
		String[] newStr=txt.split("");
		StringJoiner sj= new StringJoiner("");
		
		while(iterate.hasNext()) {
			
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

		//create a new set 
		EnumSet<STYLE> st = EnumSet.of(STYLE.KIKOO);
		EnumSet<STYLE> st1 = EnumSet.of(STYLE.CROSS);
		System.out.println(swag("miage", st));
		System.out.println(swag("miage", st1));

		//test the combined enumeration
		LinkedHashSet<STYLE> hs = new LinkedHashSet<Swag2.STYLE>();
		hs.add(STYLE.KIKOO);
		hs.add(STYLE.CROSS);
		System.out.println(swag("miage", hs));
	}
	
}
