package java1;

public class Double2 {

	public static void main(String[] args) {
		int num=9;
		int n;
		int cnt=0;
		int result=0;
		int total=0;
		int avg=0;
		for(n=1;n<65;n++) {
			
			result = num*n;
			if(result%2==1) {
				total+=result;
				cnt++;
			}
			avg =total/cnt;
		}
			System.out.printf("9x1 ~ 9x64 까지의 결과값 중 홀수 값을 더한 값의 평균은 :%d",avg);

	}

}
