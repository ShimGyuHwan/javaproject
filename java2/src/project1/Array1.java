package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data[] = {"hong","park"};
		int data2[] = {10,20};
		
		ArrayList<Object> li = new ArrayList<>(Arrays.asList(data));
		System.out.print(li);
		li.add(data2[0]);li.add(data2[1]);
		System.out.print(li);
		
		int sum = (int)li.get(2)+(int)li.get(3);
		System.out.print(sum);
		System.out.print(li.get(0).getClass().getName());
		
	}

}
