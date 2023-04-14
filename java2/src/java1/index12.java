package java1;

import java.math.BigInteger;

public class index12 {

	public static void main(String[] args) {
		int w =1;
		BigInteger b = new BigInteger("1");
		
		while(w<=100) {
			
			b =b.multiply(BigInteger.valueOf(w));
			w++;
		}
		System.out.print(b);

	}

}
