package java1;

import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		String member[][]= {
				{"홍길동","김유신","유관순"},
				{"25","31","22"}				
		};
		
		System.out.print(Arrays.toString(member[0]));
		System.out.println(member[0][1]);
		
		int i,j;
		for(i=0;i<member.length;i++) {
			for(j=0;j<member[0].length;j++) {
				System.out.println(member[i][j]);
				
			}
		}
	}

}
