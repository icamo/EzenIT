package inheritance;

public class Ex22 extends Ex21{
	String subject;
	public Ex22(int num1 , int num2, String subject ) {
		super(num1, num2);
		this.subject = subject;
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	/// 부모 클래스에 있는 div()메서드는 사용하되 코드는 사용하고 싶지 않다.
	// 자식 클래스에서 부모 클래스로 부터 상속 받은 메서드를 수정한다. : 재정의
	/// 메서드 오버라이딩
	public int div() { // 부모 클래스에 있는 메서드 의미한다.
		if (num2 == 0) {
			return 0;
		}else {
			return num1/ num2;
		}
	}
}
