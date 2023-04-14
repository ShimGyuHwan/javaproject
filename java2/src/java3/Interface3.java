package java3;



public class Interface3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserPrint u = new UserPrint();
	
		u.myinfo("");
		
	
	}

}

class UserPrint implements user2,user1 {
	private int n = this.dataea();
	@Override
	public void myinfo(String userid) {
		
		for(int i=0;i<n;i++) {
			System.out.printf("아이디:%s 고객명:%s 이메일:%s 지역:%s\n",user1.userdata[i][0],user1.userdata[i][1],user1.userdata[i][2],user2.infodata[i][2]);
				
			}
		
	}
	@Override
	public void mytel(String usertel) {
		
		
	}
	@Override
	public String pointck(String userid) {
		
		return null;
	}
	public UserPrint() {
		
	}
	@Override
	public int dataea() {
			
		return user1.super.dataea();
	}
	
}