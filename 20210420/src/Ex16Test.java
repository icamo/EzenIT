
public class Ex16Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정적 메서드는 객체생성 없이 클래스명만으로 불러올 수 있다.
		// 객체 생성없이 클래스명만으로 메서드를 불러오고 싶을 때 정적메서드를 만든다.
		Ex16.gugu(5);
		Ex16.gugu(7);
		int result = Ex16.sum(5, 100);
		System.out.println(result);
		double circle = Ex16.circle(6);
		System.out.println(circle);
	}

}
