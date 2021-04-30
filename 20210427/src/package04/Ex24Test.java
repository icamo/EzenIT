package package04;

public class Ex24Test {

	public static void main(String[] args) {
		Ex23 ex = new Ex23();
		ex.num1 = 20;
		ex.num2 = 30;
		ex.add();
		ex.div();
		Ex20 ex1 = ex;
		ex1.div();
		ex1.mul();
		Ex18 ex2 = ex;
		ex2.add();
		ex2.sub();
	}

}
