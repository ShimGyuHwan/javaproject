package java1;

public class Class1 {

	public static void main(String[] args) {
		
		Adata ad = new Adata();
		Bdata bd = new Bdata();
		//	ad.a = "심규환";
		
		System.out.println(ad.a);
		System.out.println(bd.a);
		Cdata cd = new Cdata();
		cd.a=10;
		cd.b=20;
		cd.c = cd.a + cd.b;
		System.out.print(cd.c);
		
	}

}


class Adata{
	String a = "홍길동";
}

class Bdata{
	
	String a = "이순신";
}


class Cdata{
	int a,b,c;
	
	
}