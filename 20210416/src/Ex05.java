
public class Ex05 {
	String name;
	int age;
	double height;
	
	// 객체 생성과 동시에 멤버 필드 값이 저장이 되도록 하자.
	// 생성자
	public Ex05(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	// 개발자가 생성자를 만들면 default생성자는 만들어지지 않는다.
	// default 생성자가 필요하다면 
	// 직접 정의해 주어야 한다.
	public Ex05() {}
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
