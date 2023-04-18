package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class File14 {

	public static void main(String[] args) throws Exception {
	// InputStream -> fileinputstream (파일경로) 불러오기
	//	outputStream -> fileoutputstream (파일경로) 저장하기
		
		loadfile lf = new loadfile();
		lf.code();
	}

}

class loadfile{
	File f = null;
	InputStream is = null;
	OutputStream os = null;
	
	void code() throws Exception{
		this.f = new File("E:\\git_java\\javaproject\\java2\\src\\Files\\abc.txt");
		this.is = System.in;
		byte[] word = new byte[10];
		this.is.read(word);
		System.out.println(word);
		this.os = new FileOutputStream(f,true);
		this.os.write(word);
		this.os.flush();
		os.close();
		is.close();
	
	}
}