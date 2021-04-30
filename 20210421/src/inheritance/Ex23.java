package inheritance;

public class Ex23 {
	int radius;
	double pi;
	
	public Ex23(int radius, double pi) {
		this.radius = radius;
		this.pi = pi;
	}
	public double area() {
		return radius * radius * pi;
	}
	
}
