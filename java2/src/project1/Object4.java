package project1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Object4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total=0;
		int cnt=0;
		 ArrayList<Object[]> al = new ArrayList<>(); 
	 Object product[][]={
			{1,"니베아 데오드란트",35000},
			{2,"파스퇴르 바른목장",17000},
			{3,"해남 꿀고구마",15300},
			{4,"프리미엄 생 칵테일 새우",22370},
			{5,"쉬슬러 고농축 액체세제",16620},
			{6,"믹시 삐삐 미니캐리어",99500}
			};
	 for(int j=0; j<product.length;j++) {
		 System.out.printf("%d.%s\n",product[j][0],product[j][1]);
	 }
	 
	 for(;;) {
		 System.out.println("상품을 선택하세요(종료 입력시 종료):");
		 String num =sc.next();
		 		if(num.equals("종료")) { 
		 			break;
		 		}
		 		int ea = Integer.valueOf(num);
		 		if(ea<product.length+1 && ea>0) {
				 al.add(cnt,product[ea-1]);
				 
				 total += (int)al.get(cnt)[2];
				 
				 cnt++;}
		 		else {
		 			System.out.printf("숫자는 1~%d까지만 선택가능\n",product.length);
		 		}
				
				 if(cnt==6) { System.out.println("\n상품은 최대 6개까지 선택 가능합니다."); break;
		 }
		 
		 
		
	}
	 DecimalFormat d = new DecimalFormat("###,###");
	 System.out.printf("총 상품은 %d개 이며, 총 금액은 %s 원 입니다.",al.size(),d.format(total)); 
	 }
}


