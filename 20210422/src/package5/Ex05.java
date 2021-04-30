package package5;

public class Ex05 {
	int num1;
	int num2;
	
	Ex05(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add() {
		return num1 + num2;
	}
	// 자식 클래스에서 재정의 할 수 없는 메서드이다.
	public final int sub() {
		return num1 - num2;
	}
}
