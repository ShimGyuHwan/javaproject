package java3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class OOP1 {

	public static void main(String[] args) {
		int cnt=0;
		int total =0;
		Integer money;
		ArrayList<Integer> m = new ArrayList<>();
		for(;;) {
		try {
		
			if(cnt==8)break;
			Scanner sc = new Scanner(System.in);
			System.out.println("입금할 금액을 적으세요:");
			money = sc.nextInt();
			m.add(money);
			total +=m.get(cnt);
			cnt++;
			
			}
		catch(Exception e){
			System.out.println("숫자만 입력");
			continue;
		}
		}
		
		DecimalFormat formatter = new DecimalFormat("###,###");
		System.out.println(m);
		System.out.printf("최종 입금 금액 :%s원",formatter.format(total));
		

	}

}
