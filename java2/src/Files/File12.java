package Files;

import java.io.*;


public class File12 {

	public static void main(String[] args) {
		try {
			filein fi = new filein();
			fi.fileload();
		}catch (Exception e) {
		
		}
	}

}

class filein{
	InputStream is = null;
	void fileload() throws Exception{
		
		this.is = new FileInputStream("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
		System.out.println(is.available());
		byte temp[] = new byte[is.available()];
		//int ea = this.is.read(temp);
		String data = new String(temp,0,this.is.read(temp));
		System.out.println(data);
	}
}