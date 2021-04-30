
public class Ex20 {
	static final double pi;
	static final String national;
	int val;
	// static블럭을 이용해서 상수 초기화
	static {
		pi = 3.141592;
		national = "korea";
	}

	public void print() {
		System.out.println(pi);
		System.out.println(national);
	}
}
