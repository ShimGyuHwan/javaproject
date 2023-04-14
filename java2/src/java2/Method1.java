package java2;

public class Method1 {

	public static void main(String[] args) {
		tests t = new tests(); 
			t.a++;
			t.b++;
			t.t1();
		tests tt = new tests();
		tt.a++;
		tt.b++;
		tt.t1();
		
		t.user1 +="유관순";
		t.user2 +="유관순";
		t.t2();
		tt.user1 +="강감찬";
		tt.user2 +="강감찬";
		tt.t2();
	}

}

class tests{
	int a =1;
	public static int b =1;
	String user1 = "이순신";
	public static String user2="홍길동";
	void t1() {
		System.out.println(user1);
		System.out.println(user2);
		
	}
	void t2() {
		
		System.out.println(user1);
		System.out.println(user2);
	}
}