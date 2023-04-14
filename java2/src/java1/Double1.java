package java1;

public class Double1 {

	public static void main(String[] args) {
	
			int num1 =5;
			int sum =0;
			do {
				int num2 =5;
				do {
					sum = num1 + num2;
					System.out.printf("%d+%d=%d\n",num1,num2,sum);
					num2--;
				}while(num2>=1);
				num1--;
			}while(num1>=2);
	}

}
