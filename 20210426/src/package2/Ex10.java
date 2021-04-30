package package2;

public class Ex10 implements Ex09{
	int num1;
	int num2;
	public void add() {
		System.out.println(num1 + num2);
	}
	public void sub() {
		System.out.println(num1 - num2);
	}
	@Override
	public void mul() {
		System.out.println(num1 * num2);
	}
	public void div() {
		if( num2 == 0) {
			System.out.println(0);
		}else {
			System.out.println(num1 / num2);
		}
	}
}
