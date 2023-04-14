package java3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List5 {

	public static void main(String[] args) {
		String data[] = {"hong","kim","park"};
		List<String> a = new ArrayList<>(Arrays.asList(data));
		
		System.out.print(a);
		List<Integer> b = new ArrayList<>(5);
		
		b.add(10);
		b.add(10);
		System.out.print(b);

	}

}
