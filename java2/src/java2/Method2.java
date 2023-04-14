package java2;

import java.util.Arrays;

public class Method2 {

	public static void main(String[] args) {
		test2 t = new test2();
	String a;
	String b[]= {};
	
	a = t.userinfo1();
	String info[]=a.split(",");
	b = t.userinfo2();
	
	
	System.out.println(Arrays.toString(info));
	System.out.println(Arrays.toString(b));
		

	}

}

class test2{
	
	String user_name = "홍길동";
	String user_id ="hong";
	
	public String userinfo1() {
		String userinfo =user_name+","+user_id;
		return userinfo;
	}
	public String[] userinfo2() {
		String userinfo2[] = {user_name,user_id};
		return userinfo2;
	}
}
