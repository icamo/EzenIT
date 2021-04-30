package package3;

public class Ex07Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		///Ex06 ex = new Ex06(); // 추상 클래스를 이용해서는 객체생성을 할 수 없다.
		Ex07 ex = new Ex07();
		ex.num1 = 20;
		ex.num2 = 10;
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();
	}
}
