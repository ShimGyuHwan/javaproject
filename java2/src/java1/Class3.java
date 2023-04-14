package java1;



public class Class3 {

	double result;
	public static void main(String[] args) {
		Box b = new Box();
		Coupon cp = new Coupon();
		Class3 c = new Class3();
		
		b.a();
        c.Sr();
        Coupon.event();
        String pname = cp.Pname();
        System.out.println(pname);
        int price = cp.Price();
        System.out.println(price);
	}
	
	void Sr() {
		int a =10000;
		double b = a/0.5;
		System.out.println(b);
	
	}

}
class Coupon{
	static void event() {
		int cp =30;
		System.out.println(cp);
	}
	void sale() {
		System.out.println("할인");
	}
	String Pname() {
		String a = "새우깡";
		return a;
	}
	int Price() {
		
		int a=32000;
		return a;
	}
}

class Box{
	public void a() {
		
		System.out.print("하이");
	}
}
