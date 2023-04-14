package java1;

import java.util.Scanner;

public class index6 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Q. 당신의 나이는? : ");
		int age = sc.nextInt();
		System.out.println("입력하신 나이는 :"+age);
		
		System.out.print("Q. 당신의 성함은? : ");
		String name =sc.next();
		System.out.printf("고객명은 %s 입니다",name);
		
		sc.close();
		
	}// main
}
