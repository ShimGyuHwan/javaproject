package java2;

public class Sleep {

	public static void main(String[] args) {

		int w=0;
		while(w<101) {
			try {
				Thread.sleep(1000);
			System.out.print(w);
			w++;}
			catch(Exception e){
				
			}
		}
	}
		
	

}
