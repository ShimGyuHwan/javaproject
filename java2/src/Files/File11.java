package Files;

import java.io.OutputStream;
import java.util.Arrays;

public class File11 {

	public static void main(String[] args) {
	
		try {
			load l = new load();
			l.output();
		}catch (Exception e) {
		
		}

	}

}
class load{
	OutputStream os = null;
	void output() throws Exception{
		String data ="abcde";
		byte[] b = data.getBytes();
		System.out.println(Arrays.toString(b));
		this.os =System.out;
		this.os.write(b,0,b.length);//배열,시작,종료
		this.os.flush();
	}
}