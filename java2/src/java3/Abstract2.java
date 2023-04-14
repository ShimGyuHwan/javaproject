package java3;




public class Abstract2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		box3 b = new box3();
		b.idck("hong");
		b.result();
	}

}
//abstract(추상) : 상속을 강제하는 일종의 규제
//ab1연계
//추상클래스를 상속하면 무조건 추상클래스 안에 있는 메소드를 오버라이드 해야함

/*
 	추상클래스
 	1.main에서 추상 메소드를 직접 핸들링 할 수 없음
 	2.추상클래스는 상속 위주로 사용
 	3.추상클래스에 별도로 코드작성x
 	4.필드에 변수를 선언 및 값을 적용할 수 있음
 	5.추상 클래스 안에 실제 메소드를 생성시 사용 안해도 관계없음
 	6.추상 클래스는 직접 실행이 안됩니다.
 	7.추상 클래스는 추가 상속이 가능함
 
 */

class box3 extends ab1{
	
	public void idck(String id) {
	 System.out.println(id);
		
	}
	public String loginck() {
	
		return null;
	}
	public void result() {
	System.out.println(this.aa1);
		
	}
}