
public class Ex04 {
	String name;
	int age;
	double height;
	//  클래스명과 이름이 같은 메서드
	public Ex04() {} // default 생성자 
	// 개발자가 생성자를 만들면 default생성자는 만들어지질 않는다.
	// 생성자를 만들고 default 생성자가 필요하다고 한다면 직접 적어주어야
	// 한다.
	// 생성자
	public Ex04(String name, int age, double height) {
		this.name = name;
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
