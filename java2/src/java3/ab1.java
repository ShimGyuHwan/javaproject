package java3;

public abstract class ab1 {
	public int aa1 =30;		
	public abstract String loginck();
	public abstract void idck(String id);
	public abstract void result();
	public int a[]= {1,10,15,19,8,4,7,0,2,3,9,12};
	
	
}

//외부 가상 class를 만들기 위해서는 public을 사용하지 않음.
abstract class aa {
	public abstract int password();//가상 메소드 생성
	
}

abstract class aa2 extends aa{
	public abstract String user_info();
}

class aa3{
	void aa3_m(){
		
	}
}

abstract class sum_total{
	public int a[]= {1,10,15,19,8,4,7,0,2,3,9,12};
	int sum;
	abstract void datalist();
	abstract void result();
}