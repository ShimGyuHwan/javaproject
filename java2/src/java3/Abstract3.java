package java3;

public class Abstract3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class ab3 extends aa2{ //추상클래스가 추상클래스를 상속받은 경우 최종 상속 클래스에서 모든 추상메소드를 사용해야함
	@Override
	public String user_info() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int password() {
		// TODO Auto-generated method stub
		return 0;
	}
}

class ab4 extends aa3{
	@Override
	void aa3_m() {
	
		super.aa3_m();
	}
}