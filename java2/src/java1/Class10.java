package java1;

import java.util.Scanner;

public class Class10 {

	public static void main(String[] args) {
		Logi a = new Logi();
	}

	}
class Logi{
	Scanner sc = new Scanner(System.in);
	int cnt=0;  
	
	public  Logi() {
		
		check();	
	}
	 void check() {
		 	System.out.println("아이디를 입력하세요 :");
			String mid = sc.next();
			if(!mid.equals("hong")) {System.out.println("가입되지 않은 사용자 입니다."); System.exit(0);}
			for(int i=0;i<3;i++) {
			System.out.println("패스워드를 입력하세요 :");
			String mpw = sc.next();
			
			if(!mpw.equals("a123456")) {
				cnt++;
				if(cnt==3) {
					System.out.print("해당 아이디는 10분 후에 다시 로그인 하실 수 있습니다.");
					System.exit(0);
				}
				System.out.print("패스워드가 일치하지 않습니다.\n");
			
			}
			else {break;}
			}
			System.out.print("로그인 되었습니다.");
			System.exit(0);
			
		 
	 }
}
