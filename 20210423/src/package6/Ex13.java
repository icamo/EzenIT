package package6;

public class Ex13 implements Ex12{
	@Override
	public void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	@Override
	public void sub(int num1, int num2) {
		System.out.println(num1 - num2);
	}
	@Override
	public void mul(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	@Override
	public void div(int num1, int num2) {
		System.out.println(num1 / num2);
	}
}
