package package03;

public class Ex17Test {

	public static void main(String[] args) {
		String str = "abcdefghijklmnopqrstuvwxyz";
		//            012345678
		// 3456
		System.out.println(str.substring(2, 2+4));
		int idx = str.indexOf("l");
		System.out.println(str.substring(idx, idx+4));
		
		// 데이터도 대소문자 구별함.
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		System.out.println(str1.equals(str2));
		
		String lowerStr1 = str1.toLowerCase();
		String lowerStr2 = str2.toLowerCase();
		System.out.println(lowerStr1);
		System.out.println(lowerStr2);
		System.out.println(lowerStr1.equals(lowerStr2));
		
		String upperStr1 = str1.toUpperCase();
		String upperStr2 = str2.toUpperCase();
		System.out.println(upperStr1);
		System.out.println(upperStr2);
		
		String str3 = " 이숭무";
		if(str3.trim().equals("이숭무")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		
		str3 = " 이숭무 "; // 앞뒤 공백문자를 제거
		if(str3.trim().equals("이숭무")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		str3 = " 이 숭무 "; // 중간에 있는 공백문자는 제거 대상이 아니다.
		if(str3.trim().equals("이숭무")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		str3 = " 이 숭무 "; // 중간에 있는 공백문자는 제거 대상이 아니다.
		if(str3.trim().equals("이 숭무")) {
			System.out.println("같다");
		}else {
			System.out.println("다르다.");
		}
		/*
		str3 = "1이숭무1";
		System.out.println(str1.trim('1'));
		*/
		
		int i = 10; //정수를 문자열로\
		double d = 10.5; // 실수를 문자열로
		boolean b = true; // 부울타입을 문자열로
		String i1 = "10"; // 문자열을 숫자
		int res = Integer.parseInt(i1); // 문자열을 숫자
		
		String result = String.valueOf(i);
		System.out.println(result);
		result = String.valueOf(d);
		System.out.println(result);
		result = String.valueOf(b);
		System.out.println(result);
		
	}
}
