package java1;

import java.util.Scanner;

public class index9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		System.out.printf("첫번째 숫자 %d, 두번째 숫자 %d\n",a,b);
		
		System.out.printf("두명의 이름을 입력:\n");
		
		String c = sc.next();
		String d = sc.next();
		System.out.printf("첫번째:%s,두번째:%s\n",c,d);
		sc.nextLine();
	//	Scanner sc2 = new Scanner(System.in);
		System.out.print("주소를 입력하세요:\n");
		String e =sc.nextLine();
		System.out.println("주소 : "+e);
	
	
		sc.close();
	}//main

}
