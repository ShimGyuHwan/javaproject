package java1;

import java.util.Scanner;

public class index11 {

	public static void main(String[] args) {
		
		int a =1;
		while(a<10) {
			
			System.out.println(a);
			a++;
		}
		
		int b=1;
		do {
			System.out.println(b);
			b++;
		}while(b<10);

		
		
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 숫자를 입력해 주세요:");
		int num1 =sc.nextInt();
		int num2 =sc.nextInt();
		sc.close();
		int sum=0;
		int i = num1;
		if(num1>num2) {
			while(i>=num2) {
				sum+=i;
				
				i--;
				
			}
			
			//System.out.println("첫번째 숫자가 두번째 숫자보다 크거나 같을 수 없습니다.");
			}
		else{while(i<=num2) {
			sum+=i;
			
			i++;
			
		}
		
		}
		System.out.printf("%d 부터 %d 까지의 숫자 합 : %d",num1,num2,sum);
		
		
				
	}//main

}
