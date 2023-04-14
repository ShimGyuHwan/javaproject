package java1;

import java.util.Scanner;

public class index14 {

	public static void main(String[] args) {
		float money =10000;
		float coupon = 20;
		float a = 1-(coupon/100);		
		float result = money*a;
		int sales = Math.round(result);
		System.out.print(sales);
		
		Scanner sc = new Scanner(System.in);
		float num=50000;		
		System.out.println("총 상품금액 50000원 할인 쿠폰을 얼마를 적용할까요?(%)");
		float sale = sc.nextFloat();
		float s = num*(1-(sale/100));
		int price = (int)Math.floor(s);
		System.out.printf("최종 상품금액은 %d원 입니다.",price);
		sc.close();
		
		
	}

}
