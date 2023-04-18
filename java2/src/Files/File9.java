package Files;

import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.ArrayList;


public class File9 {

	public static void main(String[] args) {
	try {
		filedata fd = new filedata();
		fd.addfile();
		
	}catch (Exception e) {
	System.out.print("오류");
	}

	}

}

class filedata{
	
	ArrayList<String> data =null;
	
	void addfile() throws Exception{
		
		this.data =(ArrayList<String>) Files.readAllLines(Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt"));
		System.out.println(data);
		
	}
}