package java1;

public class Class8 {

	public static void main(String[] args) {
			String a,b,c;
			a="하이";
			b="하이";
			c="하이";
			Class8 c8 = new Class8();
			c8.abc(a);
			c8.abc(a,b);
			c8.abc(a,b,c);
	}
	public void abc(String a) {
		System.out.println(a);
	}
	public void abc(String a,String b) {
		System.out.println(a);
		System.out.println(b);
	}
	public void abc(String a,String b,String c) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	
}
