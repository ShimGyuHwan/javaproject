package java3;

import java.util.Scanner;

public class Try1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int box;
		try {
		System.out.println("숫자를 입력하세요 :");
		box = sc.nextInt();
		}
		catch(Exception e) {
			System.out.println("숫자만 입력하세요");
		}
	}

}
