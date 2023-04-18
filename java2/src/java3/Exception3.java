package java3;

import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) throws Exception {
	
		String data[] = {"2,000","3,000","4,000","5,000","6,000"};
		method2 mt = new method2();
		
		try {
			mt.total1_method(data);
		}catch(Exception e) {
			
		System.out.print("오류");
		}
		finally {
			String[] rdata = new String[data.length];
			//ArrayList<String> rdata = new ArrayList<>();
			for(int i=0;i<data.length;i++) {
				rdata[i]=data[i].replace(",", "");
				//rdata.add(data[i].replace(",", ""));
			}
			
			mt.total1_method(rdata);
			
			
		}
		
		
	}
	
	
}

class method2{
	public void total1_method(String[] db) throws Exception{
		int sum =0;
		for(int i=0;i<db.length;i++) {
			sum +=Integer.valueOf(db[i]);
		}
		System.out.printf("총합계는 %d 입니다\n",sum);
	
	}
}