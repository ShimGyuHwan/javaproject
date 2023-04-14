package java1;

import java.util.Scanner;

public class Class4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("두개의 숫자를 입력하시오:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Calc c = new Calc();
		
		int result = c.Sum(a,b);
		if(result==0) {}
		else{System.out.printf("%d부터%d까지의 총합 : %d\n",a,b,result);
		}
		sc.close();
		prt();
	}
	
	static void prt() {
		
		System.out.println("하이하이");
	}
}


class Calc{
	
	
	int Sum(int a, int b) {
		int sum=0;
		int n;
		
		if(a>b || a==0 || b==0) {
			System.out.println("두번째 숫자가 첫번째 숫자보다 크거나 같아야합니다.");

		}
		else {
			for(n=a;n<=b;n++) {
				sum+=n;	
			}
		}
		return sum;
	}
	
	
}