package java2;

public class Metod16 {

	public static void main(String[] args) {
		
		green g = new green();

	}

}

class green{
	int aa,bb;
	String name="홍길동";
	void setter(int a, int b) {
		this.aa =a;
		this.bb =b;
		System.out.println();
	}
	
	class blue{
		int a1 = green.this.aa;
		int b1 = green.this.bb;
		String age ="30";
		void print() {
			
			System.out.println(green.this.name);
			System.out.println(a1*b1);
		}
	}
}