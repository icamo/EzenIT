package package03;

public class Ex16Test {

	public static void main(String[] args) {
		String ssn = "881212-1234567";
		//            0123456789...
		System.out.println(ssn.substring(0,8)+"******");
		int idx = ssn.indexOf("-"); // 6
		System.out.println(idx);	
		System.out.println(ssn.substring(0,idx));
		
		System.out.println(ssn.substring(idx+1));
		//월일
		System.out.println(ssn.substring(idx-4, idx));
		System.out.println(ssn.substring(2, 2+4));
		
		// 숫자 3부터 4글자
		String str = "123456789";
		///'            23456
		idx = str.indexOf('3');
		System.out.println(str.substring(idx, idx + 4));
		// 3456
		System.out.println(str.substring(2, 5));
		
	}
}
