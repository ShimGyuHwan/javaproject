package project1;

import java.util.Arrays;
import java.util.LinkedList;

public class Example4 {

	public static void main(String[] args) {
		String data[] = {"hong","kim","park"};
		LinkedList<String> nums = new LinkedList<>(Arrays.asList(data));
		nums.clear();
	
		nums.add("a");
		nums.add("b");
		nums.add("c");
		nums.set(2, "ccc");
		
		System.out.println(nums);
		boolean result =nums.contains("b");
		System.out.println(result);
	}

}
