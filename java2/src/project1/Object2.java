package project1;

import java.util.ArrayList;
import java.util.Arrays;

public class Object2 {

	public static void main(String[] args) {
			ArrayList<Object> al = new ArrayList<>();
			al.add("hong");
			al.add(25);
			al.add("hong@nate.com");
			al.add(6000);
			al.add("01023451235");
			System.out.println(al);
			
			Object data[][] = {
					{"hong","kim","park","jang"},
					{25,30,44,21}
			};
			
			System.out.println(Arrays.toString(data[1]));
			
			Object userinfo[] = {"hong",25,"서울","01023457712",5000};
			System.out.println(Arrays.toString(userinfo));
	}

}
