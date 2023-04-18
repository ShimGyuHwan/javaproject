package java3;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class Exception7 {

	public static void main(String[] args) {
	Object data[] = {"김민수",55,"김민재","민지현",48,"이세현","이수정",34,88};
		
		setter s = new setter();
		System.out.print(s.str(data));
		

	}

}

class setter{
	
	public ArrayList<String> str(Object[] data) {
		ArrayList<String> al = new ArrayList<>();
			for(int i=0;i<data.length;i++) {
				try {
			//	if(Pattern.matches("^[a-zA-Zㄱ-ㅎ가-힣]*", String.valueOf(data[i]))==true) {
				String id =String.valueOf((String)data[i]); 	
				al.add(id);				}
		
				catch (Exception e) {
					//System.out.print(e.getMessage());
				}
			}
		//	}
		
			
	
		
		
		return al;
	}
	
}