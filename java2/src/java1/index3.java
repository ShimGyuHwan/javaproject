package java1;

public class index3 {

	public static void main(String[] args) {
		
		int a,b;
		a=10;
		b=20;
		
		if(a>b) {
			System.out.print("a가 b보다 큽니다");
		}
		else if(a<b) {
			System.out.println("b가 a보다 큽니다");
		}
		else {
			System.out.print("같습니다");
		}

		String userid ="hong";
		String userpw ="a12345";
		
		if(userid=="hong"&&userpw=="a12345") {
			System.out.println("로그인 되었습니다");
		}
		else {
			System.out.println("로그인 실패");
		}
	
		
		int b1 = 500;
		String bb =Integer.toString(b1);
		System.out.println(bb);
		String c1 ="600";
		int d1=10;
		int sum = Integer.valueOf(c1)+d1;
		System.out.println(sum);
		
		int z =10;
		z++;
		System.out.println(z);
		
		int k =50;
		k+=k;
		System.out.println(k);
		
		char f ='h';
		System.out.print(f);
}
}