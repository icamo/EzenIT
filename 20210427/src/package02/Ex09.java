package package02;

public class Ex09 extends Ex08 {
	int num1;
	int num2;
	@Override
	public void add() {
		System.out.println(num1 + num2);
	}
	@Override
	public void sub() {
		System.out.println(num1 - num2);
	}
	@Override
	public void mul() {
		System.out.println(num1 * num2);		
	}
	@Override
	public void div() {
		if(num2 == 0) {
			System.out.println(0);
		}else {
			System.out.println(num1 / num2);
		}
	}
	
}
