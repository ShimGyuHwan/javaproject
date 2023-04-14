package java1;

import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2 mb = new Member2();
		
		mb.list("심규환", 99);
		Scanner sc = new Scanner(System.in);
		System.out.println("사용하실 구구단 숫자를 하나 입력해 주세요 :");
		int a = sc.nextInt();
		
		if(a>0) { mb.Gugu(a);}else {System.out.println("숫자는 0보다 커야합니다");}
		sc.close();

	}

}

class Member2{
	void list(String user,int level) {
		
		System.out.printf("고객명:%s 레벨:%d\n",user,level);
	}
	
	void Gugu(int a) {
		int sum=0;
		int n;
		for(n=9;n>0;n--) {
			sum = a*n;
			System.out.printf("%d x %d = %d\n",a,n,sum);
			
		}
		
	}
}