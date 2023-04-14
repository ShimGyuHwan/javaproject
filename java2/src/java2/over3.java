package java2;

public class over3 {

	public static void main(String[] args) {
		
		Tel t = new Tel();
		t.userlist("");
	}

}

class Tel extends over1{

		@Override
		public void userlist(String username) {
			
			super.userlist(username);
			
			System.out.printf("SKT:%d명\nKT:%d명\nLGT:%d명",a,b,c);
		}
}