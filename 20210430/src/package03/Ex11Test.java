package package03;

public class Ex11Test {

	public static void main(String[] args) {
		String ssn = "010624-1230123";
		///           01234567890123
		///                     1
		// index에 해당되는 문자 추출
		char ch = ssn.charAt(7);
		System.out.println(ch);
		switch(ch) {
		case '1' :
		case '3' :
		case '7' :
		case '9' : System.out.println("남자입니다.");
		case '2' :
		case '4' :
		case '8' :
		case '0' : System.out.println("여자입니다.");
		}
	}
}
