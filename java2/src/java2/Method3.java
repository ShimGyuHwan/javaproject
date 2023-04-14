package java2;

public class Method3 {
	
	public static void main(String[] args) {
		cdb c = new cdb();
		
		c.a1 ="홍길동";
		c.a3 ="hong@gmail.com";
		c.data1("실버회원");
	
	}

}

class cdb{
	String a1 =null;
	private String a2 = null;
	public static String a3 = null;
	
	void data1(String level) {
		System.out.println(a1);
		a2 = level;
		System.out.println(a2);
		System.out.println(a3);
	}
}