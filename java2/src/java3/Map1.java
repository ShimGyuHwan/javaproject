package java3;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		
	 Map<String, String> data  = new HashMap<>();
	 data.put("id","hong");
	 data.put("name","홍길동");
	 data.put("id","kang");
	 System.out.println(data);
	 System.out.println(data.get("name"));
	 Map<Integer, String> data2  = new HashMap<>();
	 for(int i=1;i<10;i++) {
	 data2.put(i, "하이");}
	 System.out.print(data2);
	}

}
