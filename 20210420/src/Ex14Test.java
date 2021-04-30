
public class Ex14Test {
	// static 메서드는 클래스명으로 호출하는 메서드이므로
	// 객체를 통해 호출하지 않는다.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex14 ex = new Ex14();
		ex.test();
		ex.staticTest();
		Ex14.staticTest(); // 클래스 메서드
		int result = ex.plus(10, 20);
		System.out.println(result);
		result = Ex14.plus(10 ,  40);
		System.out.println(result);
	}
}
