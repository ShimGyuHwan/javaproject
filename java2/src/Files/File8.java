package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.LineNumberReader;

public class File8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		buffer b = new buffer();
		b.dataview();
	}

}

class buffer{
	FileReader fr = null;
	BufferedReader br = null;
	void dataview() throws Exception{
	 this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
	 this.br = new BufferedReader(this.fr);
	 System.out.println(this.br.readLine());
	 
	// 조건문에 Buffered readLine 사용시 해당 첫번째 라인은 캐시메모리에서 삭제
	 /* if(this.br.readLine()!=null) {
		 System.out.println(this.br.readLine());
	 }
	*/
	 this.fr = new FileReader("E:\\git_java\\javaproject\\java2\\src\\Files\\notice.txt");
	 LineNumberReader li = new LineNumberReader(this.fr);
	 int ea = 0;
	 while(li.readLine() !=null) {
		 ea = li.getLineNumber();
	 }
	 System.out.println(ea);
	 String text ="";
	 while((text=this.br.readLine())!=null) {
		
		 System.out.println(text);
	 }
		
	}
}