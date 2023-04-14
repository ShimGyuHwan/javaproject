package java2;

import java.util.Scanner;

public class Method12 {

	public static void main(String[] args) {
		
		bbox2 b2 = new bbox2();
		b2.ask();

	}

}

class bbox1{
	protected String user;
	void ask() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("고객명을 입력하세요 : ");
		this.user =sc.next();
	}
	public void search(String nm) {
		
	}
}
class bbox2 extends bbox1{
	
	@Override
	void ask() {
	
		super.ask();
		search(this.user);
	}
	
	@Override
	public void search(String nm) {
		// TODO Auto-generated method stub
		super.search(nm);
		if(nm.equals("홍길동")) {
			
			System.out.print("하이");
		}
		
	}
		
	}
