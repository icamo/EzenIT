package package03;

public class Ex20Test {

	public static void main(String[] args) {
		String url = "https://news.naver.com/main/read.nhn";
		String contextPath = "/main"; 
		// �� �� ���ڿ��� �̿��Ͽ� "/read.nhn"�� ����Ͻÿ�.
		System.out.println(url.substring(url.indexOf(contextPath)+contextPath.length()));
		
		
	}

}
