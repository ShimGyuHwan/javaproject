package java2;

public class Method11 {

	public static void main(String[] args) {
		student st = new student();
		st.info("홍길동","30");
		st.print();	

	}

}


class person{
	protected String name;
	protected String age;

	public void info(String name,String age) {
		this.name =name;
		this.age = age;
		
	}
	void print() {
		System.out.println("고객명 :"+this.name);
	}
}

class student extends person{
		
		@Override
		void print() {
			super.print();
			System.out.println("나이는 :"+this.age);
		}
}