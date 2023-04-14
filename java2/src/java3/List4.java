package java3;

import java.util.ArrayList;
import java.util.Scanner;

public class List4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> a1 = new ArrayList<>();
		int no;
		while(true) {
			System.out.println("숫자를 입력해 주세요");
			no =sc.nextInt();
			a1.add(no);
			int ea =a1.size();
			if(ea>=10) break;
		
		}
		System.out.print(a1);
	}

}
