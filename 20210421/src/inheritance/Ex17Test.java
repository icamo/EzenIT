package inheritance;

public class Ex17Test {

	public static void main(String[] args) {
		Ex18 ex = new Ex18(); // Ex17();
		// this() 자신의 생성자.
		// super() 부모 생성자
		System.out.println(ex.num1); // 20
		System.out.println(ex.num2); // 10
		int result = ex.add();
		System.out.println(result);
		result = ex.mul();
		System.out.println(result);
		
		Ex18 ex1 = new Ex18(30); // super(num1)
		ex1.setNum2(20);
		
		Ex18 ex2 = new Ex18(20, 10);
		
	}

}
