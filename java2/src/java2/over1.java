package java2;

public class over1 {
public String list[][]= {
			{"홍길동","hong","서울","hong@nate.com","SKT"},
			{"이순신","lee","인천","lee@nate.com","KT"},
			{"강감찬","kang","제주","kang@nate.com","KT"},
			{"장보고","jang","강원","jang@nate.com","LGT"}
			};
	
     int a,b,c;
	 public String se;
	public void userlist(String username) {

		this.se =username;
		for(int i=0;i<list.length; i++) {
			
			if(list[i][4].equals("SKT")) {
				a++;
			}
			else if(list[i][4].equals("KT")) {
				b++;
			}
			else if(list[i][4].equals("LGT")) {
				c++;
			}
		}	
	}
}
