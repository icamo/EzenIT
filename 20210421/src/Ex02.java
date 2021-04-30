
public class Ex02 {
	private int age;
	private String name;
	private String addr;
	
	public Ex02() {}
	public Ex02(int age, String name, String addr) {
		this.addr = addr;
		this.age = age;
		this.name = name;
	}
	// setter : 멤버필드에 값을 저장하는 메서드를 setter라 함
	public void setAge(int age) {
		this.age = age;
		// this를 적어주는 이유는 인스턴스 변수(즉, 멤버필드)임을 나타냄
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	// getter
	public int getAge() {
		return this.age;
	}
	public String getName() {
		return this.name;
	}
	public String getAddr() {
		return this.addr;
	}
}



