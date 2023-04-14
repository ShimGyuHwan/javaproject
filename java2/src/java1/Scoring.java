package java1;



public class Scoring {
	Class_array2 ca = new Class_array2();
	
	 void Score(String s,String a1[],String a2[]) {
		int i;
		int cnt=0;
		for (i=0;i<a1.length;i++) {
			
			if(s.equals(a1[i])) {
					System.out.printf("%s님은 %s점 입니다\n",a1[i],a2[i]);
					cnt++;
			}
			
		}
		if(cnt==0) {
			System.out.println("해당 사용자의 데이터가 존재하지 않습니다.");
		}
		
	}
	
}
