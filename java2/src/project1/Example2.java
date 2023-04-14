package project1;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		box[] b = {new abox(),new abox2(),new abox3()};
		for(int i=0;i<b.length;i++) {
			b[i].dataload();
		}
		
	}

}

abstract class box{
	public abstract void dataload();
}

class abox extends box{
	@Override
	public void dataload() {
		// TODO Auto-generated method stub
	System.out.println("abox1 로드");	
	}
}

class abox2 extends box{
	@Override
	public void dataload() {
		// TODO Auto-generated method stub
	System.out.println("abox2 로드");	
	}
}
class abox3 extends box{
	@Override
	public void dataload() {
		// TODO Auto-generated method stub
	System.out.println("abox3 로드");	
	}
}
