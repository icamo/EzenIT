package inheritance;

public class Ex24 extends Ex23{
	String subject;
	public Ex24(int radius, double pi, String subject) {
		super(radius,pi);
		this.subject = subject;
	}
	// 부모 클래스로 부터 상속 받은 메서드를 자식 클래스에서 Math.PI를 사용한다고 
	// 재정의 : 메서드  오버라이딩
	public double area() {
		return radius * radius * Math.PI;
	}
	public double area(double p) { /// 오버로딩
		return radius * radius * p;
	}
}