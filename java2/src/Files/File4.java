package Files;

import java.io.FileWriter;
import java.io.IOException;

public class File4 {

	public static void main(String[] args) throws IOException {
		
		String userdata[] = {"hong","kim","park","jang"};
		
		FileWriter fw = new FileWriter("E:\\git_java\\javaproject\\java2\\src\\Files\\message2.txt",true);
		int w =0;
		do {
			fw.write(userdata[w]);
			w++;
		}while(w<userdata.length);
		fw.close();
	}

}
