package package1;

public class Ex04 extends Ex03{
	public Ex04() {}
	public Ex04(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public double areacircle() { // 재정의 
		return radius * radius * Math.PI;
	}
	
	public double area() {
		return super.areacircle(); // 부모 클래스에 있는 메서드 사용
	}
}
