package java3;

import java.util.Scanner;

public class Heap {
	static int box2 =20;
	public static void main(String[] args) {
		int box1 =20;
		Integer box3 =20;
		Integer box4 = new Integer(20);
		
		if(box1==box3) System.out.println("동일함");
		if(box3==box4) System.out.println("동일함");
		if(box3.equals(box4)) System.out.println("동일함2");
		if(box1==box4) System.out.println("동일함3");
	}

}
