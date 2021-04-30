package package02;

public class Ex11Test {

	public static void main(String[] args) {
		Ex08 ex = new Ex09();
		Ex09 ex1 = (Ex09)ex;
		ex1.num1 = 100;
		ex1.num2 = 200;
		ex1.add();
		Ex08 ex2 = new Ex09();
		ex1 = (Ex09)ex2;
		ex1.num1 = 300;
		ex1.num2 = 500;
		ex2.add();
		
		ex1 = (Ex09)ex;
		ex1.add();
		
		ex1 = (Ex09)ex2;
		ex1.add();
	}

}
