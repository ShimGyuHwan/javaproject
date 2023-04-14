package java1;

import java.util.Scanner;

public class Double3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		long a;
		int cnt=0;
		long sum=1;
	    for(n=1;n<4;n++) {
	    	System.out.printf("%d번째 숫자를 입력하세요:\n",n);
	    	a = sc.nextLong();
	    	if(a%2==0) {
	    		sum*=a;
	    	}
	    	else {
	    		cnt++;
	    	}
	    }
	    sc.close();
	    if(cnt>=2) {
	    	
	    	System.out.println("짝수의 숫자가 확인 되지 않습니다.");
	    }
	    else {
	    	System.out.printf("결과값 : %d",sum);
	    }
	    
	}

}
