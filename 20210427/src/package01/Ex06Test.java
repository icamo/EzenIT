package package01;

public class Ex06Test {

	public static void main(String[] args) {
		Ex02 ex = new Ex02();
		Ex02 ex3 = ex;
		Ex02 [] ex1 = new Ex02[3];
		ex1[0] = new Ex02();
		ex1[1] = new Ex02();
		ex1[2] = new Ex02();
		Ex02 [] ex2 = ex1;
		objPrint(ex);
		ex.add();
		objArrayPrint(ex1);
		ex1[0].add();
	}
	public static void objArrayPrint(Ex02 [] ex02) {
		ex02[0].num1 = 100;
		ex02[0].num2 = 300;
		ex02[0].add();
	}
	public static void objPrint(Ex02 ex03) {
		ex03.num1 = 200;
		ex03.num2 = 100;
		ex03.add();
	}
	

}
