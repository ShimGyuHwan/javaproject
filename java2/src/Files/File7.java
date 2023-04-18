package Files;


import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class File7 {

	public static void main(String[] args) throws Exception {
		
		int cnt=0;
		String[] m = {};
		ArrayList<String[]> al = new ArrayList<>();
		FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\member.txt");
		Scanner sc = new Scanner(fr);
		
		while(sc.hasNext()) {
		//	System.out.println(Arrays.toString(sc.nextLine().split(",")));
			m= sc.nextLine().split(","); 
			al.add(m);
		}
		sc.close(); fr.close();
		for(int i=0;i<al.size();i++) {
		System.out.println(Arrays.toString(al.get(i)));
		}
		
	}

}


