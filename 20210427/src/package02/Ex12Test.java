package package02;

public class Ex12Test {

	public static void main(String[] args) {
		Ex09 ex;
		Ex08 ex1 = new Ex09();
		ex = (Ex09)ex1;
		ex.num1 = 300;
		ex.num2 = 500;
		ex.add();
		ex1.add();
		
		Ex08 ex2 = new Ex09();
		ex = (Ex09)ex2;
		ex.num1 = 300;
		ex.num2 = 200;
		ex.add();
		ex2.add();
		
		ex = (Ex09)ex1;
		ex.add();
		
		ex = (Ex09)ex2;
		ex.add();
	}

}
