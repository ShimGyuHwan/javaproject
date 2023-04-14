package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class List2 {

	public static void main(String[] args) {
		String user[] = {"hong","kim","park","jang"};
		ArrayList<String> al = new ArrayList<>(Arrays.asList(user));
		
		for(int i=0;i<al.size();i++) {
			
			if(al.get(i).equals("kim")){
				al.remove(i);
			}
		}
		//System.out.print(al);
		
		
		ArrayList<Integer> num = new ArrayList<Integer>(Arrays.asList(10,7,6,1,11,37,41,22)); 
		
		for(int i=0;i<num.size();i++) {
			
			if(num.get(i)%2==0) {
				num.remove(i);
			}
		}
		Collections.sort(num);
		System.out.print(num);
		Collections.sort(num,Collections.reverseOrder());
		System.out.print(num);
	}

}
