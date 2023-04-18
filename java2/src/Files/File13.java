package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class File13 {
	//파일 생성
	public static void main(String[] args) {
		try {
		File fi = new File("E:\\git_java\\javaproject\\java2\\src\\Files\\abc.txt");
		if(fi.exists()==false) {
		fi.createNewFile();}
		String data = "홍길동";
		OutputStream os = new FileOutputStream(fi);
		byte[] b = data.getBytes();
		os.write(b);
		os.flush();
		os.close();
		}catch (Exception e) {
			// TODO: handle exception
		}

	}

}
