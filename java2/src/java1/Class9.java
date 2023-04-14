package java1;

import java.util.Scanner;

public class Class9 {

	public static void main(String[] args) {
		
		Resrv r = new Resrv();
	}

}

class Resrv{
	Scanner sc = new Scanner(System.in);
	public Resrv() {
		System.out.println("방번호를 입력하세요(1~3)\n(1.무지개룸    2.패밀리룸    3.달빛아래룸)");
		int RoomNum = sc.nextInt();
		if(RoomNum !=1 && RoomNum !=2 && RoomNum !=3) {
			System.out.print("올바른 값이 아닙니다.");
			
		}
		else {
			Price(RoomNum);
		}
		
	}
	
	void Price(int a) {
		int price =0;
		
		if(a==1) {
			price=60000;
		}
		else if(a==2) {
			price=125000;
		}
		else if(a==3) {
			price=100000;
		}
		Coupon(price);
	}
	
	void Coupon(int a){
		float money=0;
		money =(float)a;
		
		System.out.println("30% 할인 쿠폰을 적용하시겠습니까?(y/n)");
		String agree =sc.next();
		float sale=(1-0.3f);
		if(agree.equals("y")) {
			money =a*sale;
		}
		else { money = a; }
		System.out.printf("최종 결제 가격은 %d원 입니다.",(int)Math.round(money));
	}
}