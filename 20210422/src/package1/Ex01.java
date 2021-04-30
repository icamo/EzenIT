package package1;

public class Ex01 {
	int num1;
	int num2;
	
	public Ex01() {
		num1 = 20;
		num2 = 10;
	}
	public Ex01(int num1) {
		this.num1 = num1;
	}
	public Ex01(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	public int mul() {
		return num1 * num2;
	}
	public int div() {
		return num1 / num2;
	}	
}
