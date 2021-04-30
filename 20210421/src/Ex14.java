
public class Ex14 {
	private String name;
	String addr; // protected
	int age; // 오버로딩
	public Ex14() {}
	public Ex14(String name) {
		this.name = name;
	}
	Ex14(int age) { // default
		this.age = age;
	}
	public Ex14(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public Ex14(String name, String addr, int age) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr= addr;
	}
	public void setAge(int age) {
		this.age = age;
	}
	// getter
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
	public int getAge() {
		return this.age;
	}
}
