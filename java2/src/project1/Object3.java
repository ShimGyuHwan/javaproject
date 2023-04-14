package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Object3 {

	public static void main(String[] args) {
		ob1 ob =new ob1();
		ob.data1();
	}

}

class ob1{
	ArrayList<Object[]> al;
	Object data[][];
	int sum;
	int avg;
	public void data1() {
		this.data = new Object[][]{
			{"hong","kim","park"},
			{2000,5000,4000,2200,3100,4120}
		};
		
		this.al =new ArrayList<>(Arrays.asList(data));
		System.out.println(Arrays.toString(al.get(1)));

		for(int i=0;i<al.get(1).length;i++) {
			sum +=(int)al.get(1)[i];
			
		}
		avg = sum/al.get(1).length;
		System.out.printf("총 평균 포인트는 : %d원 입니다",avg);
		
	}
}