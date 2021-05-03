package package03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex11Test {

	public static void main(String[] args) {
		
		Date now = new Date();
		String strNow = now.toString();
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� HH�� mm�� ss�� S");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
		sdf = new SimpleDateFormat("yyyy�� MM�� dd�� W�� HH�� mm�� ss�� S");
		strNow2 = sdf.format(now);
		System.out.println(strNow2);
		
	}

}
