package package1;

public class Ex02 extends Ex01{
	public void add() {
		System.out.println(num1 + num2);
	}
	public void sub() {
		System.out.println(num1 - num2);
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
