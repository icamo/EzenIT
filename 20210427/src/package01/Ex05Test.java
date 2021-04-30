package package01;

public class Ex05Test {

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		Ex02 ex1 = ex;
		ex.num1 = 200;
		ex1.num2 = 300;
		ex.add();
		ex1.div();
		
		Ex02 [] ex2 = new Ex02[3];
		ex2[0] = new Ex02();  // num1, num2
		ex2[1] = new Ex02();
		ex2[2] = new Ex02();
		Ex02 [] ex3 = ex2;
		ex2[0].num1 = 200;
		ex3[0].num2 = 100;
		ex2[0].add();
		ex3[0].div();
		objPrint(ex);
		objArrayPrint(ex2);
		ex2[0].mul();
	}
	public static void objArrayPrint(Ex02 [] ex03) {
		ex03[0].mul();
	}
	public static void objPrint(Ex02 ex02) {
		ex02.mul();
	}
}
