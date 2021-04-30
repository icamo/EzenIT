package package1;

public class Ex02Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex02 ex = new Ex02(); // 자식클래스의 default 생성자 실행
		int result = ex.add();
		System.out.println(result);
		Ex02 ex1 = new Ex02(30); // 매개변수가 하나인 자식 클래스 생성자 실행
		result = ex1.mul();
		System.out.println(result);
		Ex02 ex2 = new Ex02(20,10);
		result = ex2.div(); // 20/10
		System.out.println(result);
		Ex02 ex3 = new Ex02(0, 20); 
		result = ex3.div(); // 0 / 20 = 0
		System.out.println(result);
		Ex02 ex4 = new Ex02(20, 0); 
		result = ex4.div(); // 20 / 0 = 불능
		
	}

}
