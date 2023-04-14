package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array6 {

	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int i=0;
		int cnt=0;
		String[] menu_s= new String[10];
		String menu[]= {"햄버거","피자","치킨","라면","김밥","커피"};
		while(i<=10) {
			System.out.println("주문하고자 하는 메뉴를 선택해 주세요:\n1.햄버거 2.피자 3.치킨 4.라면 5.김밥 6.커피 7.선택종료");	
			int select = sc.nextInt();
			int n = select-1;
			if(select <= 0|| select>7) {
				System.out.println("메뉴는 1~7 까지만 선택해 주세요");
			}
			else {
				if(select ==7) {
				System.out.println("주문이 완료되었습니다.");
				System.out.printf("주문 내역 : %s",Arrays.toString(menu_s));				
				System.exit(0);
				}
				menu_s[cnt]= menu[n];
				System.out.println(menu[n]+" 선택 완료");
				cnt++;
				}
				
		sc.close();	
			}
			
		}

	}

