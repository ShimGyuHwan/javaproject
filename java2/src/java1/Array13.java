package java1;

import java.util.Arrays;
import java.util.Scanner;

public class Array13 {

	public static void main(String[] args) {
		String lists ="";
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			System.out.println("학급 학생 아이디를 입력해 주세요");
			String id = sc.next();
			lists +=id + " ";
			
		}
		
		
		String userdata[] = lists.split(" ");
		System.out.print(Arrays.toString(userdata));
		sc.close();
	}

}
