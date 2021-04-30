package package05;

public class Ex28Test {
	public static void main(String [] args) {
		Ex26 ex = new Ex26(); // 디펄트 메서드 재정의 안함.
		ex.method1(9);
		ex.method2();
		
		Ex27 ex1 = new Ex27(); // default method 재정의
		ex1.method1(7); 
		ex1.method2();
	}
}