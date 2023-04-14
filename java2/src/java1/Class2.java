package java1;

import java.util.Scanner;

class member{
	String user ="홍길동";
		void info() {
	
	
		System.out.printf("유저 이름은 %s 입니다\n",user);
	}

	
}
class Inject{
	void user(String name,String pw) {
		System.out.printf("사용자명 : %s, 패스워드:%s\n",name,pw);
	}
}

class prep{
	int sum=0;
	void m_result(int a, int b) {
		sum = a*b;
		if(sum%2==0) {
			System.out.println("두 숫자의 곱은 짝수입니다");
		}
		else {
			System.out.println("두 숫자의 곱은 홀수입니다");
		}
	}
}
public class Class2 {
	
	public static void main(String[] args) {
		prep p = new prep();
		member m = new member();
		Inject i = new Inject();
		Scanner sc = new Scanner(System.in);
		m.info();
		i.user("심규환", "a1234");
		System.out.println("두 숫자를 입력하세요 :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		p.m_result(a,b);
	}

}
