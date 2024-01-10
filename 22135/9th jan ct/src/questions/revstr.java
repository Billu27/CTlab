package questions;

public class revstr {
	public String strreverse(String a) {
		String b;
		char c;
		int i;
		for(i = a.length(); i>=0; i--) {
			c=a.charAt(i);
			b=c+b;
		}
	System.out.println(b);
		return a;
		
	}
}
