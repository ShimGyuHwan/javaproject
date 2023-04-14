package java1;

import java.util.Scanner;

public class Class7 {

	public static void main(String[] args) {
		Join j = new Join();
	}
}

class Join{
	
	Scanner sc = new Scanner(System.in);
	public Join() {
		System.out.println("회원가입에 동의하십니까?(Y/N)");
		String agree = sc.next();
		Agree(agree);
		
	}
		void Agree(String agree) {
			if(!agree.equals("N") && !agree.equals("Y")) {
				
				System.out.println("Y 혹은 N 만 입력 가능합니다.");
				
			}
			else if(agree.equals("N")) {
				System.out.println("회원가입이 취소 되었습니다. 다시 시작하기(Y)");
				String re = sc.next();
				if(re.equals("Y")) {
				ReStart();} else {System.out.println("프로그램을 종료합니다."); System.exit(0);}
				}
			else if(agree.equals("Y")) {
				
					Input();
			}
		}
		void Input() {
		   System.out.println("아이디를 입력하세요 :");
		   String mid = sc.next();
		   if(mid.equals("admin")) {
			   
			   System.out.println("중복된 아이디 입니다.");
			   
			   Input();
			   
		   }
		   System.out.println("패스워드를 입력하세요 :");
		   String mpw = sc.next();
		   System.out.println("가입자명를 입력하세요 :");
		   String us =sc.next();
		   System.out.printf("아이디:%s 패스워드:%s 가입자명:%s\n회원가입이 완료되었습니다.",mid,mpw,us);
		   System.exit(0);
			  
		   }
		
	   void ReStart() {
			Scanner sc = new Scanner(System.in);
			System.out.println("회원가입에 동의하십니까?(Y/N)");
			String agree = sc.next();
			Agree(agree);
		}
		
	
		
}
