package java2;

import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 {

	public static void main(String[] args) {
		closepm cp =new closepm();
		Frame fr = new Frame();
		fr.setTitle("사용로그인");
		fr.setSize(500,500);
		fr.setVisible(true);
		fr.addWindowListener(cp);
		Panel p = new Panel();
		Checkbox c1 = new Checkbox("자동로그인");
		p.add(c1);
		fr.add(p);
		
		

	}

}
class closepm extends WindowAdapter{
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
		System.out.println("프로그램 종료");
		System.exit(0);
	}
	
	
}