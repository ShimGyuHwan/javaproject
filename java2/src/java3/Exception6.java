package java3;

public class Exception6 {

	public static void main(String[] args) {
		idcheck id  =new idcheck();
		try {
			String callsign = id.id_result("hong");
			System.out.print(callsign);
		}
		catch (Exception e) {
			if(e.getMessage() !=null) {
				System.out.println(e);
			}

		}

	}

}

class idcheck{
	public String id_result(String mid) throws Exception{
		String call ="";
		if(mid==null || mid.equals("")){
		throw new Exception("error");
		}
		else {
			if(mid.equals("hong")){
				System.out.print("yes");
			}
			else {
				System.out.print("no");
			}
				
		}
		return call;
}
}