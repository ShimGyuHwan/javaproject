package java3;

import java.util.Arrays;

public class Exception4 {

	public static void main(String[] args) {
		String data[] = {"hong3000","park1250","kang852","kim1819","lee5117"};
		int sum=0;
		int new_data[] = new int[data.length];
		try {
			for(int i=0; i<data.length;i++) {
				data[i] +=  Integer.valueOf(data[i]);
				
			}
		}
		catch (Exception e){
			for(int i=0; i<data.length;i++) {
				new_data[i] += Integer.valueOf(data[i].replaceAll("[a-zA-z]", ""));
				
				
				
			}
			
		}
		finally {
			for(int i=0;i<new_data.length;i++) {
				sum +=new_data[i];
			}
			System.out.println("포인트합계 :"+sum);
		}
		
		}

	}


