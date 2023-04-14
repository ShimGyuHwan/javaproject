package java1;

import java.util.Arrays;

public class Array11 {

	public static void main(String[] args) {
		int Adata[][] = {{5,17,19,22,33},{1,2,3,4,5}};
		String Bdata[] = new String[Adata[0].length];
		int i;
		int sum=0;
		
			for(i=0;i<Adata[0].length;i++) {
				
				sum = Adata[0][i]+Adata[1][i];
				if(sum%2==0) {
					Bdata[i]="짝수";
				}
				else {
					Bdata[i]="홀수";
				}
				
			}
		System.out.print(Arrays.toString(Bdata));
			
			
	}

}
