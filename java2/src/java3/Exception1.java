package java3;

public class Exception1 {

	public static void main(String[] args) {
		
		int a=0;
		String b ="12";
		
		try {
			 a = Integer.valueOf(b);
		}catch(Exception e) {
			System.out.println("숫자로 변환되지 않습니다.");
		}
		finally {
			
			b = b.replaceAll("[a-zA-Z]","");
		//	a = Integer.valueOf(b);
			a = a+10;
			System.out.println(a);
		}
		System.out.println(a);
	}

}
