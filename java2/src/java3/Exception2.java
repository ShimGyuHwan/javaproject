package java3;

public class Exception2 {

	public static void main(String[] args) {
	
		try {
			Exception2 ex = new Exception2();
			String data ="3000a";
			ex.test(data);
		}catch(Exception e) {
			
			System.out.println(e);
			System.out.println("문제발생");

		}
	
		
	}

	void test (String b) throws Exception  {
		int k = Integer.valueOf(b);
		Exception c = new Exception();
		
	}
}
