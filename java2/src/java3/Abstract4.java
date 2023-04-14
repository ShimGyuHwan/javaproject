package java3;

import java.util.Arrays;

public class Abstract4 {
	
	public static void main(String[] args) {
		st st = new st();
			st.datalist();
			st.result();
	}

}

class st extends sum_total{
	@Override
	void datalist() {
		Arrays.sort(this.a);
		System.out.println(Arrays.toString(this.a));
	}
	
	@Override
	void result() {
	 
	for(int i=0; i<this.a.length; i++) {
		
		this.sum +=this.a[i];
	}
	System.out.print(sum);
	}
}