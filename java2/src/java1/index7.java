package java1;

import java.util.Scanner;

public class index7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("Q.입금할 금액을 적어주세요:");
		int m = sc.nextInt();		
		System.out.println("Q.입금 진행 하시겠습니까?(Y/N)");
		String c = sc.next();
		
		if(c.equals("Y")){
			System.out.println("입금 처리 되었습니다.");
		}
		else if(c.equals("N")) {
			System.out.print("입금 처리 취소 되었습니다.");
		}
		else {
			System.out.print("올바른 입력값을 입력해 주세요");
		}
		System.out.print(m);
		sc.close();
	}

}
