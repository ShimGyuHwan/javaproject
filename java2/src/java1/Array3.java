package java1;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
	
	
		String user[] = {"hong","kim","park","jang","han"};
			Match m = new Match();
			m.IdSearch(user);
	}

}

class Match{
	Scanner sc = new Scanner(System.in);
	void IdSearch(String user[]) {
		
		System.out.print("아이디를 입력하세요:");
		String mid = sc.next();
		int ea = user.length;
		int i;
		int cnt=0;
		for(i=0;i<ea;i++) {		
		if(user[i].equals(mid)) {
			cnt++;}}
		
		if(cnt>0) {
		 System.out.print("확인 되었습니다.");	
						
		}
		else {
			System.out.println("미가입자 입니다.");
			
		}
	}
}