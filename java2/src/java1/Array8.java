package java1;

import java.util.Arrays;

public class Array8 {

	public static void main(String[] args) {
		String data1[] = {"대한민국","일본","중국","베트남","태국"};
		int data2[] = {40,35,70,55,32};
		String data3[] = new String[5];
		int i;
		for(i=0;i<data1.length;i++) {
		
		data3[i]=data1[i]+"("+data2[i]+")";}
		System.out.print(Arrays.toString(data3));
	}

		
}
