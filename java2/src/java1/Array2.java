package java1;

public class Array2 {

	public static void main(String[] args) {
		String user[]= {"hong","kim","park"};
		
		Array2 ar = new Array2();

		ar.abc(user);
		
	}

	public void abc(String a[]) {
		int ea = a.length;
		System.out.println(ea);
		System.out.println(a[0]);
	}
}
