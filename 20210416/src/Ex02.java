
public class Ex02 { 
	// Ä¸½¶È­
	// ¸â¹ö ÇÊµå
	private String name;
	private double height;
	private int age;
	private String addr;
	
	// ¸Þ¼­µå
	                   //¸Å°³º¯¼ö
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
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getAddr() {
		return this.addr;
	}
	public void print() {
		System.out.println(this.name);
		System.out.println(this.height);
		System.out.println(this.age);
		System.out.println(this.addr);
	}
}








