package java2;

import java.util.Scanner;

public class Method13 {

	public static void main(String[] args) {
		
		printGugu p = new printGugu();
		
		p.gugu();
	}

}

class gugudan{
	
	protected int number;
	public void gugu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색 할 구구단을 입력하세요 :");
		this.number = sc.nextInt();
		
	}
	public void result() {
		
	}
}

class printGugu extends gugudan{
		public void gugu() {
			super.gugu();
			result(this.number);
		}
		
		public void result(int number) {
			super.result();
			int sum=0;
			System.out.printf("%d 단 출력\n",number);
			for(int i =1;i<10;i++) {
				sum = i*number;
				System.out.printf("%d x %d = %d\n",number,i,sum);
			}
			
		}
}	

