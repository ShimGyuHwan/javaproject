package java1;

import java.util.Scanner;

public class index10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		int dan;
		int result=0;
		System.out.println("출력할 구구단의 단을 입력하세요 :");
		dan = sc.nextInt();
		System.out.println(dan+"단 출력");
		sc.close();
		for(i=1;i<10;i++) {
			result = dan *i;
			System.out.printf("%d x %d = %d\n",dan,i,result);
		}
	}

}
