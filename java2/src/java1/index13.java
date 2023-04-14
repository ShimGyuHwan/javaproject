package java1;

import java.text.SimpleDateFormat;
import java.util.*;

public class index13 {

	public static void main(String[] args) {
		Date d =new Date();

		System.out.println(d);
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		SimpleDateFormat time = new SimpleDateFormat("H:mm:ss a");
		SimpleDateFormat dt =new SimpleDateFormat("yyyy-MM-dd H:mm:ss");
	
		System.out.println(date.format(d));
		System.out.println(time.format(d));
		System.out.println(dt.format(d));
		
	
	}

}	
