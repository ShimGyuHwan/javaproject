package java1;

import java.util.Scanner;

public class Random1 {

	public static void main(String[] args) {
		double number =Math.random();
		System.out.println(number);
		Game g = new Game();
		g.pc();
	}

}

class Game{
	Scanner sc = new Scanner(System.in);
	int ai = (int)Math.ceil(Math.random()*5);
		void pc() {
			System.out.print("1~5까지 숫자 중 하나를 입력하세요 :");
			int num =sc.nextInt();
			if(ai == num) {
				System.out.print("정답");
			}
			else {
				this.pc();
			}
			
		}
}