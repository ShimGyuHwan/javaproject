package java1;

import java.util.Arrays;

public class Random2 {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		
		for(int i=0;i<lotto.length;i++) {
			int num = (int)(Math.random()*46)+1;
			lotto[i]=num;
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
			
		}
		System.out.print(Arrays.toString(lotto));
	}

}
