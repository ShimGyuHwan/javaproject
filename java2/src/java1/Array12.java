package java1;

public class Array12 {

	public static void main(String[] args) {
	
		int data1[][] = {{11,42,22,16},{7,33,10,29}};
		int sum=0;
		for(int i =0;i<data1.length;i++) {
			
			for(int j=0;j<data1[0].length;j++) {
				
				if(data1[i][j]%2==0) {
					
					sum+=data1[i][j];
				}
			}
		}
		System.out.printf("배열의 요소중 짝수의 합은 : %d",sum);
	}

}
