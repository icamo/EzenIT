package package02;

public class Ex13Test {

	public static void main(String[] args) {
		Ex09 ex; // 객체가 없는 변수
		Ex08 ex1 = new Ex09();
		
		Ex08 ex2 = ex1;
		ex = (Ex09)ex2;  
		ex.num1 = 100;
		ex.num2 = 200;
		ex.add();
		ex2.add();
		ex1.add();		
		objPrint(ex1);
		ex1.add();
	}
	public static void objPrint(Ex08 ex02) {
		Ex09 ex = (Ex09)ex02;
		ex.add();
		ex02.add();
		ex.num1 = 1200;
		ex.num2 = 1300;
	}
}
