package java2;

public class Method15 {

	public static void main(String[] args) {
		

	}

}

class color1{
	
	public String abc() {
		
		return null;
	}
	public boolean zzz(String nm) {
		
		
		return true;
	}

}

class color2 extends color1{
	
	public void zzz() {
		
	}
	
	@Override
	public String abc() {
	
		return super.abc();
	}
	@Override
	public boolean zzz(String nm) {
	
		return super.zzz(nm);
	}
}
