package java2;

public class Method14 {

	public static void main(String[] args) {

		test1 t = new test1();
		t.info("홍길동","30");
		System.out.print(t.equals(10));
	}

}

class test1 extends Object{
	
	private String name;
	private String age;
	public void info(String n,String a) {
		this.name= n;
		this.age=a;
	}
	@Override
	public String toString() {
	
		return super.toString();
	}
	@Override
	public boolean equals(int z) {
	
		return super.equals(z);
	}
}

class Object{
	public String toString() {
		
		return null;
	}
	public boolean equals(int z){
		
		return true;
	}
}