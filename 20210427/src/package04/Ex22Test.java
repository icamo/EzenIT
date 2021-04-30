package package04;

public class Ex22Test {

	public static void main(String[] args) {
		Ex21 ex = new Ex21();
		ex.num1 = 100;
		ex.num2 = 200;
		ex.add();
		
		Ex19 ex1 = new Ex21();
		Ex21 ex2 = (Ex21)ex1;
		ex2.num1 = 30;
		ex2.num2 = 50;
		ex2.add();
		ex1.add();  // Ex18
		ex1.div();  // Ex19
		
		Ex18 ex3 = ex1;
		ex3.add();
		// ex3.mul();
	}
}