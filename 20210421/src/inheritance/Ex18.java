package inheritance;

public class Ex18 extends Ex17 {
	// 부모 클래스의 생성자를 실행하기 위해 자식 클래스에 생성자 추가
	public Ex18() { 
		super(); // 부모 클래스의 default생성자 호출 Ex17(){}
	}
	public Ex18(int num1) {
		super(num1);// Ex17(int num1){...}
	}
	public Ex18(int num1, int num2) {
		super(num1, num2); //Ex17(int num1, int num2) {...}
	}
	public int mul() {
		return num1 * num2;
	}
	public int div() {
		return num1 / num2;
	}
}
