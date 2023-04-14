package java1;

import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		String a1[] = {"홍길동","이순신","강감찬","유관순","김유신"};
		String a2[] = {"100","80","39","42","55"};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요 :");
		String name = sc.next();
		
		Scoring s = new Scoring();
		
		s.Score(name,a1,a2);
		sc.close();
	}

}
