package java3;


import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


public class List6 {

	public static void main(String[] args) {
		Integer a[] = {1,3,5,7,9};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(a));
		System.out.println((ln));
		ln.add(2);
		ln.addFirst(20);
		System.out.println((ln));
		Collections.sort(ln);
		System.out.println((ln));
		
		
		String b[] = {"aa","bb","cc","dd"};
		LinkedList<String> ls = new LinkedList<String>(Arrays.asList(b));
	ls.remove("cc");
	System.out.println((ls));
	}
	}


