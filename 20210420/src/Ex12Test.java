
public class Ex12Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex12 ex = new Ex12();
		int result = ex.plus(10, 20);
		System.out.println(result);
		result = ex.minus(20, 10);
		System.out.println(result);
		System.out.println(ex.aaa);
		System.out.println(ex.pi);
		
		result = (int) Ex12.pi;
		System.out.println(result);
		
		Ex12 ex1 = new Ex12();
		ex1.aaa = 12000;
		System.out.println("ex1.aaa : " + ex1.aaa);
		System.out.println("ex.aaa : " + ex.aaa);
		ex.aaa = 200;
		System.out.println("ex1.aaa : " + ex1.aaa);
		System.out.println("ex.aaa : " + ex.aaa);
		// 인스턴스변수는 단른 객체에서 값이 변했다고 해서 같이 바귀지는 않는다.
		
		ex.pi = 122;
		System.out.println("ex1.pi : " + ex1.pi);
		ex1.pi = 3000;
		System.out.println("ex.pi : " + ex.pi);
		
		
	}

}
