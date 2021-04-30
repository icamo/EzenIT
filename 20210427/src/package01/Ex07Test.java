package package01;

public class Ex07Test {

	public static void main(String[] args) {
		Ex01 ex = new Ex02();
		Ex01 ex1 = ex;
		ex.num1 = 200;
		ex1.num2 = 300;
		ex.add();
		ex1.add();
		
		Ex01 [] ex2 = new Ex01[3];
		ex2[0] = new Ex02();
		ex2[1] = new Ex02();
		ex2[2] = new Ex02();
		Ex01 [] ex3 = ex2;
		ex2[0].num1 = 200;
		ex3[0].num2 = 300;
		ex2[0].add();
		ex3[0].add();
		objPrint(ex);
		ex.div();
		objArrayPrint(ex2);
		ex2[0].div();
	}
	public static void objArrayPrint(Ex01 [] ex03) {
		ex03[0].add();
		ex03[0].num1 = 250;
		ex03[0].num2 = 10;
	}
	public static void objPrint(Ex01 ex01) {
		ex01.div();
		ex01.num1 = 250;
		ex01.num2 = 10;
	}
}
