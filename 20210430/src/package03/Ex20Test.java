package package03;

public class Ex20Test {

	public static void main(String[] args) {
		String url = "https://news.naver.com/main/read.nhn";
		String contextPath = "/main"; 
		// 위 두 문자열을 이용하여 "/read.nhn"만 출력하시오.
		System.out.println(url.substring(url.indexOf(contextPath)+contextPath.length()));
		
		
	}

}
