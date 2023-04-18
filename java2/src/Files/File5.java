package Files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File5 {

	public static void main(String[] args) throws IOException {
		String user_total="";
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\user.txt",true);
		for(int i =0; i<5;i++) {
			Scanner sc = new Scanner(System.in);
			System.out.print("사용자 아이디를 입력하세요 :");
			String user = sc.next();
			user_total +=user+" ";
			
		}
		fw.write(user_total);
		fw.close();
	
	}

}
