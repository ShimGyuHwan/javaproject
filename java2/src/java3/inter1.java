package java3;

public interface inter1 {
	String names = "홍길동";
		public void z1();
		default void z1_1(int a, int b) {
			
			int sum =a+b;
			System.out.print(sum);
		}
}

