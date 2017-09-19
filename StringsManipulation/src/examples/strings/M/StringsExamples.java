package examples.strings.M;

public class StringsExamples {
	public static void main(String args[]) {
		String str= "Hello class, lets think string manipulation";
		String rts = "", buffer="";
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==' '||i==str.length()-1) { //check for end of string or space
				if(i==str.length()-1) {
					buffer+=str.charAt(i);
				}
				for(int x = buffer.length()-1; x>=0;x--) {
					rts+=buffer.charAt(x);
				}
				if(i!=str.length()-1) {
					rts+=str.charAt(i);
					buffer="";
				}
			}
			if(str.charAt(i)!=' ') {
				buffer+=str.charAt(i);
			}
		}
		System.out.println(rts);
	}
}
