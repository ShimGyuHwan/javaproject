package java1;

import java.util.Scanner;

public class index8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("아이디를 입력하세요: ");
		String mid = sc.next().intern();
		
		if(mid.equals("shim")||mid.equals("park")) {
			System.out.print("회원이 확인 되었습니다.");
			
		}
		else {
			System.out.print("비회원 입니다.");
		}
		
		if(mid=="shim"||mid=="park") {
			System.out.print("회원이 확인 되었습니다.");
			
		}
		else {
			System.out.print("비회원 입니다.");
		}
		*/	
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		if(num>100) {
			System.out.println("숫자는 100까지만 입력 가능합니다.");
		}
		else {
			if(num%2==0) {
				System.out.printf("입력한 숫자: %d,짝수",num);
			}
			else {
				System.out.printf("입력한 숫자: %d,홀수",num);
			}
		}
		sc.close();

	}

}
