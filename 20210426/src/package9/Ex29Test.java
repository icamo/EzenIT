package package9;

public class Ex29Test {

	public static void main(String[] args) {
		Ex28 ex = new Ex28();
		print(ex);
		Ex27 ex1 = new Ex28();
		print(ex1);
		Ex28 [] ex2 = new Ex28[3];
		print(ex2);
		Ex27 [] ex3 = new Ex28[3];
		print(ex3);
	}
	public static void print(Ex27 [] a) {
		a[0] = new Ex28();
		Ex28 b = (Ex28)a[0];
		b.num1 = 20;
		b.num2 = 30;
		b.sub();
	}
	public static void print(Ex28 [] a) {
		a[0] = new Ex28();
		a[0].num1 = 10;
		a[0].num2 = 20;
		a[0].div();
	}
	public static void print(Ex27 a) { // 부모 클래스 매개변수 
		Ex28 ex = (Ex28)a;
		ex.num1 = 20;
		ex.num2 = 30;
		ex.add();
	}
	public static void print(Ex28 a) {
		a.num1 = 20;
		a.num2 = 30;
		a.div();
	}

}
