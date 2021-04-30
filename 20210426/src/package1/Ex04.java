package package1;

public class Ex04 extends Ex01{
	public void add() {
		System.out.println(num2 + num1);
	}
	public void sub() {
		System.out.println(num2 - num1);
	}
	@Override
	public void div() {
		if(num2 == 0) {
			System.out.println("ºÒ´É");
		}else {
			System.out.println(num1 / num2);
		}
	}
}
