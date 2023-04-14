package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	   user_print p = new user_print();
	   p.ui();
	}

}


class user_print extends Userinfo{
ArrayList<String[]> a1;
	
@Override
	void ui() {
	int sum=0;
	this.a1 = new ArrayList<String[]>(Arrays.asList(this.data));
	 for(int i=0; i<a1.size();i++) {
		 sum += Integer.valueOf(a1.get(i)[6]);
	 }
	 System.out.printf("포인트총합:%d",sum);
	}	
}