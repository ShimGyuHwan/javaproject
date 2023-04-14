package project1;

import java.util.Scanner;

public class Example1 implements Rand {

	public static void main(String[] args) {
		int cnt=0;
		int rand = Rand.r;
		Scanner sc = new Scanner(System.in);
		for(;;) 
		{
				if(cnt!=4) {
				System.out.println("1~10까지의 숫자를 입력하세요:");
				int c = sc.nextInt();
				if(c > rand) {
					System.out.println("DOWN");
				}
				else if(c<rand) {
					System.out.println("UP");
				}
				else {System.out.println("정답"); break;}
				cnt++;
				
				}
				else {
					System.out.println("정답을 맞추지 못했습니다.");
					break;
				}

	}

}
}