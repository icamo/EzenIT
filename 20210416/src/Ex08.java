
public class Ex08 {
	String name;
	int age;
	double height;
	// 생성자의 이름은 같은 매개변수의 개수가 다른 거나 매개변수의 종류가 
	// 다른 것을 오버로딩이다.
	public Ex08() {}
	public Ex08(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Ex08(String name, double height, int age) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	public Ex08(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Ex08(int age, double height) {
		this.age = age;
		this.height = height;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
}
