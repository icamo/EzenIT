package package02;

public class Ex14Test {

	public static void main(String[] args) {
		double d = 10.5;
		int i = (int)d;
		System.out.println(i);
		System.out.println(d);
				
		Ex09 ex;
		Ex08 ex1 = new Ex09(); // 자동 형변환
		Ex08 ex2 = ex1;
		ex = (Ex09)ex2; // 강제 형변환 ex
		ex.num1 = 300;
		ex.num2 = 400;
		ex.add();
		ex1.add();
		ex2.add();
		objPrint(ex1);
		ex1.add();
		
		Ex08 [] ex3 = new Ex08[3];
		ex3[0] = new Ex09();
		ex3[1] = new Ex09();
		ex3[2] = new Ex09();
		
		Ex08 [] ex4 = ex3;
		ex = (Ex09)ex4[0];
		ex.num1 = 10;
		ex.num2 = 30;
		ex.add();
		ex3[0].add();
		ex4[0].add();
		objArrayPrint(ex3);
		ex3[0].add();
	}
	public static void objArrayPrint(Ex08 [] ex04) {
		Ex09 ex = (Ex09)ex04[0];
		ex.add();
		ex.num1 = 300;
		ex.num2 = 500;
	}
	public static void objPrint(Ex08 ex02) {
		Ex09 ex = (Ex09)ex02;
		ex.add();
		ex.num1 = 1500;
		ex.num2 = 2000;
	}

}
