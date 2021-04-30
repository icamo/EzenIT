package package1;

public class Ex08Test {

	public static void main(String[] args) {
		//Ex06 ex = new Ex06(); 
		// 추상 클래스는 객체 생성이 되질 않는다.
		// 추상클래스는 무조건 상속해야 한다.
		Ex07 ex = new Ex07();
		ex.num1 = 20;
		ex.num2 = 10;
		ex.add();
		ex.div();
		ex.mul();
	}

}
