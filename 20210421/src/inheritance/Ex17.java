package inheritance;

public class Ex17 {
	int num1;
	int num2;
	public Ex17() {
		num1 = 20;
		num2 = 10;
	}
	public Ex17(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	Ex17(int num1){ // default
		this.num1 = num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int add() {
		return num1 + num2;
	}
	public int sub() {
		return num1 - num2;
	}
}
