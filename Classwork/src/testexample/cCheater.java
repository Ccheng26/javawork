package testexample;

public class cCheater extends bCheater{
	public static void main(String[] arg) {
		aCheater obj = new bCheater();
		bCheater obj2= new bCheater();
		System.out.println(obj.a);
		System.out.println(obj2.a);
		System.out.println(obj2.b);
	}
}
