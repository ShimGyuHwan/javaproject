package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class OOP3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(15,22,37,8,11,19,41));
		num.remove(2);
		num.add(0,7);
		num.remove(5);
		num.add(5,39);
		System.out.print(num);
		
		
	}

}
