
public class Ex09 {

	int age;
	String name;
	double height;
	
	public Ex09() {} // 생성자의 오버로딩
	public Ex09(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public Ex09(int age, String name, double height) {
		this.age = age;
		this.name = name;
		this.height = height;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age; //매개변수가 없을 경우에는 this를 안 적어줘도 가능하다.
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	
	

}
