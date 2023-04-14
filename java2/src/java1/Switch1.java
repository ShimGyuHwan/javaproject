package java1;

public class Switch1 {

	public static void main(String[] args) {
		int a= 10;
		switch(a) {
		
		case 1:
		case 10:
			System.out.print("옵션1을 선택");
			break;
		case 2:
			System.out.print("옵션2을 선택");
			break;
		case 3:
			System.out.print("옵션3을 선택");
			break;
		default:
			System.out.print("옵션 없음");
			break;
		}

	}

}
