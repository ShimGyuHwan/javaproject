package java1;
import java.util.Scanner;

public class index5 {

	public static void main(String[] args) {
		int a=10;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자가 원하는 숫자를 입력하세요:");
		int b = sc.nextInt();

		if(a>b) {
			
			System.out.println("업");
		}
		else if(a<b) {
			
			System.out.println("다운");
		}

		else {
			System.out.println("정답");
		}
		sc.close();
	}//main

}
