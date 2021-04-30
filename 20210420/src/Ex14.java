
public class Ex14 {
	static int idx = 0;
	int aaa = 100;
	static void staticTest() {
		System.out.println("static 메서드입니다.");
	}
	void test() {
		System.out.println("일반 메서드 실행");
	}
	static int plus(int num1, int num2) {
		return num1 + num2;
	}
}
