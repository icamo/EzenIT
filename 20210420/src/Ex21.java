
public class Ex21 {
	final double pi;
	final String national;
	int val;
	// 상수에 초기값이 없는 경우에는 생성자나 static블럭을 이용해서 초기화를 할 수 있다.
	public Ex21(double pi, String national) {
		this.pi = pi;
		this.national = national;
	}
	public void print() {
		System.out.println(pi);
		System.out.println(national);
	}
}
