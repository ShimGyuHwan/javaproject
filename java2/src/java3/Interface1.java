package java3;

public class Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		key k = new key();
		k.z1();
	}

}

class key implements inter1,inter2{
	@Override
	public void z1() {
		
		System.out.println(this.names);
	}
	@Override
	public void z2() {
		// TODO Auto-generated method stub
	
	}
	@Override
	public String z3() {
		// TODO Auto-generated method stub
		return null;
	}
}
