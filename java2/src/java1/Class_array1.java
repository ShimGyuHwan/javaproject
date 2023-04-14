package java1;

public class Class_array1 {

	public static void main(String[] args) {
		int num[] = {15,60,11,14,27};
		int sum=0;
		for(int i : num) {
			
			sum +=i;
		}
		System.out.printf("배열값의 총 합은 :%d\n",sum);
		
		
		String id[] = {"hong","kim","park","lee","jang","jung"};
			
			for(String i :id) {
				if(i.length()>=4) {
					
					System.out.println(i);
				}
			}
		
	}

}
