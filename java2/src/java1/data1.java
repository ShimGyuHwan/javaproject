package java1;


import java.util.Arrays;

public class data1 {
	String user[] = new String[] {"hong","kim","jang"};
	int num = 0;
	public String[] UserList() {
		num=100;
		int w=0;
		while(w<user.length) {
			System.out.println(user[w]);
			w++;
		}
		
		//System.out.println(Arrays.toString(user));
		return user;
	}
}
