package java2;

import java.util.Arrays;

public class over2 {

	public static void main(String[] args) {
		
		myinfo mi = new myinfo();
		mi.userlist("홍길동");
	}

}


class myinfo extends over1{
	
		@Override
		public void userlist(String username) {
		
			super.userlist(username);
			System.out.println(Arrays.deepToString(list));
			System.out.print(se);
		}
}