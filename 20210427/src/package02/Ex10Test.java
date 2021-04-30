package package02;

public class Ex10Test {

	public static void main(String [] main) {
		//Ex08 ex = new Ex08();추상클래스로는 객체 생성할 수 없다.
		
		Ex08 ex = new Ex09(); //  자동 형변환
		Ex08 ex1 = ex;
		Ex09 ex2 = (Ex09)ex1; // 강제 형변환
		ex2.num1 = 30;
		ex2.num2 = 20;
		ex2.add();
		ex.add();
		
		Ex08 [] ex3 = new Ex08[3];
		ex3[0] = new Ex09();
		ex3[1] = new Ex09();
		ex3[2] = new Ex09();
		
		Ex09 ex4 = (Ex09)ex3[0];
		ex4.num1 = 200;
		ex4.num2 = 10;
		ex3[0].add();
	}
}
