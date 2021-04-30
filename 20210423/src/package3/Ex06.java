package package3;

public abstract class Ex06 { // 완성되지 않은 클래스
	int num1; // 0으로 초기화가 되어 있음
	int num2;
	public abstract void add(); // 정의가 되지 않은 메서드 : 추상 메서드
	public abstract void sub(); // 정의가 되지 않은 메서드 : 추상 메서드
	public abstract void mul(); // 정의가 되지 않은 메서드 : 추상 메서드
	public void div() { // 정의가 된 메서드
		System.out.println(num1 / num2);
	}
}
