package java3;

public class Exception5 {

	public static void main(String[] args) {
		
		ex2 e = new ex2();
		
		try {
			e.loader("ok");
		}
		catch (Exception et) {
			System.out.print("오류");
		}

	}

}


class ex2{
	void loader(String a) throws Exception{
		try {
		if(a =="ok") {
			String data = "1,000";
			int money = Integer.valueOf(data);
			Exception ep = new Exception();
			throw ep;
			
		}
		else {
			System.out.print("데이터 잘못 전달");
		}
		}catch (Exception e) {
			System.out.print(e.getMessage());
		}
	}
}