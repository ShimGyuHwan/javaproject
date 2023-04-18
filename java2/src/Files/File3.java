package Files;

import java.io.FileReader;

public class File3 {

	public static void main(String[] args) {
	try {
			FileReader fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\data.dat");
	
			System.out.println(fr.read());
	while(true) {
		
	}
	}catch (Exception e) {
		System.out.println("파일오류");
	}

	}

}
