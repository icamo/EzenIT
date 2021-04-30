package package03;

import java.io.UnsupportedEncodingException;

public class Ex14Test {

	public static void main(String[] args) {
		String str = "ABCDE";
		byte[] bytes1 = str.getBytes();	
		System.out.println("bytes1.length: " + bytes1.length);
		str = new String(bytes1);
		System.out.println("bytes1->String: " + str);
		try {
			bytes1 = str.getBytes("EUC-KR");
			System.out.println("EUC-KR의 크기는 " + bytes1.length);
			
			bytes1 = str.getBytes("UTF-8");
			System.out.println("UTF-8의 크기는 " + bytes1.length);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}		
	}
}
