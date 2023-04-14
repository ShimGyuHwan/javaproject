package java1;

public class index4 {

	public static void main(String[] args) {
		//반복문
		
		int f;
		for(f=1;f<=10;f++) {
			System.out.println(f);
		}
		
	int a,b;
	for(a=2;a<10;a++) {
		
		for(b=1;b<10;b++) {
			System.out.printf("%d*%d=%d\n",a,b,(a*b));
		}
	}
		int sum=0;	
		for(a=45;a<61;a++) {
			
			sum+=a;
			
		}
		System.out.println(sum);
		
		int sum2=0;
		for(b=1;b<201;b++) {
			if(b%2==1) {
				sum2+=b;
			}
			
		}
		System.out.println(sum2);
		int c;
		int sum3=0;
        for(c=20;c<61;c++) {
        	if(c%3==0) {
        		sum3+=c;
        		
        	}
        }
		if(sum3%2==0) {
			System.out.print("짝수\n");
		}
		else {
			System.out.print("홀수\n");
		}
		
		int result=0;
		for(a=7;a>2;a--) {
			for(b=9;b>0;b--) {
				result=a*b;
				if(result%2==1) {
					System.out.printf("%d x %d = %d\n",a,b,result);
					
				}
			}
		}
		
	
}//main
			
			
}
