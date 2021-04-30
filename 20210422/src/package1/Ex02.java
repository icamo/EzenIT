package package1;

public class Ex02 extends Ex01{
	public Ex02() {
		super(); // 부모 클래스의 default 생성자를 실행 
	}
	public Ex02(int num1) {
		super(num1);
		num2 = 20;
	}
	public Ex02(int num1, int num2) {
		super(num1, num2);
	}
	public int add() {
		return  num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
	public int div() { // 부모로 부터 받은 메서드를 재정의 : 메서드 오버라이딩
		if( num2 == 0) {// 메서드 재정의를 하면 부모 메서드를 사용할 수 없다.
			return 0;
		}else {
			return num1 / num2;
		}
	}
}
