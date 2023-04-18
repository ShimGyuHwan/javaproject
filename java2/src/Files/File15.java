package Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File15 {

	public static void main(String[] args) {
		try {
			Path data1 =Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
			Path data2 =Paths.get("E:\\git_java\\javaproject\\java2\\src\\Files\\notice2.txt");
			Files.copy(data1,data2);
		}catch (Exception e) {

		}

	}

}
