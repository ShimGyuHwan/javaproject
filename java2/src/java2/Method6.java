package java2;

public class Method6 {

	public static void main(String[] args) {
	
		mysql m = new mysql();
		String number  = m.check("홀수");
		System.out.printf("총 갯수는 %s 입니다",number);
	}

}



class mysql{
	private int num[] = {15,22,17,14,32,35,19,33};
	int cnt=0;
	public String check(String a) {
		String msg="";
		int i;		
		for(i=0; i<num.length;i++){
		if(a.equals("짝수")){	if(num[i]%2==0) {
			 cnt++;	
			}
		}
		else if(a.equals("홀수")) {
			if(num[i]%2==1) {
				cnt++;
			}
		}
		}
		msg = String.valueOf(cnt);
		return msg; 
	
}
	}
