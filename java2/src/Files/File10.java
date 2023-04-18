package Files;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class File10 {

	public static void main(String[] args) throws UnsupportedEncodingException {
	InputStream is = new InputStream() {
	
		public int read() throws IOException {
			int a =15;
			return a;
		}
	};
		try {
			System.out.println(is.read());
		}catch (Exception e) {
			
		}
	/*	InputStream k =  {
			
			public int read() throws IOException {
				// TODO Auto-generated method stub
				return 0;
			}
		}
		InputStream
*/		InputStream user = System.in;
		try {
			int Keycode = user.read();
			System.out.println(Keycode);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		InputStreamReader ir = new InputStreamReader(is,"UTF-8");
		try {
			System.out.println(ir.read());
		}catch (Exception e) {
		
		}
	}

}
