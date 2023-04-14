package java2;

public class Method4 {

	public static void main(String[] args) {
	
			insert i = new insert();
			
			i.userid = "hong";
			String member_key ="123456";
		String ck =i.checks(member_key);
		if(ck.equals("ok")) {
			System.out.println("정상적인 접근");
		}
		else {
			System.out.println("올바른 접근이 아닙니다.");
		}
	}	

}

class insert{
	String userid = null;
	private String key ="memberok";
	public String checks(String a) {
		String call = null;
		if(a.equals(key)) {
			call = "ok";
		}
		else {
			call ="error";
		}
		return call;
	}
}