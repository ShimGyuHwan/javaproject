package Files;

import java.io.FileReader;
import java.nio.charset.Charset;

public class File2 {

	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\agree.txt",Charset.forName("EUCKR"));
			System.out.println(fr.getEncoding());
			System.out.println(fr.read());
			
			while(true) {
				int a = fr.read();
				System.out.println((char)a);
				if(a==-1) break;
			}
		}catch(Exception e) {
			System.out.println("파일 경로 실패");
		}

	}

}