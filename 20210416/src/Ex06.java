
public class Ex06 {
	String name;
	int age;
	double height;
	// 생성자를 만들어준 이유는 객체 생성시에 멤버 필드에 값을 주기 위함 
	public Ex06(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public double getHeight() {
		return this.height;
	}
}
