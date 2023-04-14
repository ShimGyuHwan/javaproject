package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class List3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(3,6,9,12,15));
		num.add(0,2);
		num.add(2,4);
		System.out.print(num);
		
		Integer num1[] = {3,6,9,12,15};
		Integer num2[] = {2,4};
		ArrayList<Integer> num_1 = new ArrayList<Integer>(Arrays.asList(num1));
		ArrayList<Integer> num_2 = new ArrayList<Integer>(Arrays.asList(num2));
		ArrayList<Integer> num3 = new ArrayList<Integer>();
		num3.addAll(num_1);
		num3.addAll(num_2);
	/*	for(int i=0;i<num1.length;i++) {
			num3.add(num1[i]);
			}
		for(int i=0;i<num2.length;i++) {
			num3.add(num2[i]);
	}*/
		Collections.sort(num3);
		System.out.print(num3);
		
		Scanner sc = new Scanner(System.in);
	  /* while(true) {
		   System.out.println("숫자를 입력하세요");
		   int no = sc.nextInt();
		   if(no==10) break;
		   }*/
	   
	   for(;;) {
		   System.out.println("숫자를 입력하세요");
		   int no = sc.nextInt();
		   if(no==10) break;
	   }
	   }
		
}