package project1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array {

	public static void main(String[] args) {
		int data[] = {1,2,3,4};
		String data1[] = {"a","b","c","d"};
		
		Map<Integer, String> m = new LinkedHashMap<>();
		
		for(int i=0;i<data.length;i++) {
			m.put(i, data1[i]);
		}

	}

}
