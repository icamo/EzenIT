package package03;

public class Ex15Test {

	public static void main(String[] args) {
		String oldStr = "나는 python이 좋아요.";
		
		String newStr = oldStr.replace("python", "자바");
		System.out.println(newStr);
		
		oldStr = oldStr.replace("python", "java");
		System.out.println(oldStr);
	}
}
