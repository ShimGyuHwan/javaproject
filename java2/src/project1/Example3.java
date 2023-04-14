package project1;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Example3 {
   
	public static void main(String[] args) {
		Map<String, Integer> data = new LinkedHashMap<>();
		 String[] data1 = {"서울","경기도","인천","대전","충북","충남","전북","전남"};
		
		 for(int i=0;i<data1.length;i++) {
			 Scanner sc =new Scanner(System.in);
			 try {
				System.out.println(data1[i]+"님에게 포인트를 추가하시겠습니까?");
				int point = sc.nextInt();
				 data.put(data1[i],point);
			}catch(Exception e) {
				System.out.println("숫자만 입력 가능합니다");
				i--;
				}
			}
		 	
		 for(int j=0;j<data1.length;j++) {
			 System.out.printf("%s : %d\n",data1[j],data.get(data1[j]));
		 }
		 /*
		 for(String key : data.keySet()) {
			 System.out.printf("%s : %d\n",key,data.get(key));
		 }*/
	}

}
