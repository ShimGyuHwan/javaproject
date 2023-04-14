package java3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Interface2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자 아이디를 입력하세요:");
		String id = sc.next();
		sc.close();
		userinfo21 ui = new userinfo21();
		ui.myinfo(id);
		ui.pointck(id);
	}

}

class userinfo21 implements user2,user1{
	private int total;
	DecimalFormat df = new DecimalFormat("###,###");
	@Override
	public String pointck(String userid) {
		
		return null;
	}
	@Override
	public int dataea() {
	
		return user1.super.dataea();
	}
	@Override
	public void myinfo(String userid) {
		int cnt=0;
		int point=0;
		this.total =dataea();
		for(int i=0;i<this.total;i++) {
		if(userid.equals(user2.infodata[i][0])) {
				cnt++;
			point = Integer.valueOf(user2.infodata[i][4]);
			
		}
		}
		if (cnt==0) System.out.println("등록된 회원이 아닙니다.");
		else  System.out.printf("%s님의 포인트 : %d\n",userid,point);}	
	@Override
	public void mytel(String usertel) {
	
		
	}
	
}