package package06;

public class Ex32Test {

	public static void main(String[] args) {
		Ex30 ex = new Ex30(); // 추상메서드만 재정의
		ex.method1(7);
		ex.method2();
		
		Ex31 ex1 = new Ex31(); // 추상메서드와 일반 메서드 재정의
		ex1.method1(6);
		ex1.method2();
	}
}
