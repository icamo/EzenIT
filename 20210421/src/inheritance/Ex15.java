package inheritance;

public class Ex15 {
	// private 상속이 안된다.
	int num1; // 멤버 필드의 접근 지정자는 protected가 된다.
	protected int num2;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int add() {
		return num1 + num2;
	}
	int sub() {
		return num1 - num2;
	}
}