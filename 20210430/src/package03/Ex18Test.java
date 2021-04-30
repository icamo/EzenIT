package package03;

public class Ex18Test {

	public static void main(String[] args) {
		String text ="나는 자바 프로그램을 잘 하도록 노력합니다.";
		String [] res = text.split(" ");
		System.out.println(res);
		for(String str : res) {
			System.out.println(str);
		}
		text ="나는`자바`프로그램을`잘`하도록`노력합니다.";
		res = text.split("`"); 
		for(String str : res) {
			System.out.println(str);
		}
		text = "홍길동&이수홍,박연수,김자바-최명호";
		res = text.split("&|,|-");
		for(String str : res) {
			System.out.println(str);
		}
	}
}
