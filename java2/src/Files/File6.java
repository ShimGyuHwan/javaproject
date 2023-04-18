package Files;

import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.Scanner;

public class File6 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		notice n = new notice();
		n.view();
	}

}

class notice{
	FileReader fr = null;
	Scanner sc =null;
	public void view() throws Exception {
		try {
			this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt",Charset.forName("UTF-8"));
			this.sc = new Scanner(this.fr);
			
			while(this.sc.hasNext()) {
				System.out.println(this.sc.nextLine());}
			this.fr.close();
			this.sc.close();
		}catch (Exception e) {
			System.out.print("메소드 함수 오류");
		}
	}
}