package java3;

import java.util.ArrayList;
import java.util.Arrays;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String member[] = {"박소은","윤준승","김여름"};
		
		ArrayList<String> newmember = new ArrayList<>(Arrays.asList(member));
		newmember.add("심규환");
		newmember.add(3,"asdasdasd");
		System.out.print(newmember);
		
		String user = newmember.get(4);
		newmember.remove(4);
		System.out.print(newmember);
	}

}
