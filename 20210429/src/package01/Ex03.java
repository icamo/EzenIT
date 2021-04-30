package package01;

public class Ex03 {
	static int idx;
	private String email;
	String name;
	public Ex03(String email, String name){
		idx++;
		this.email = email;
		this.name = name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getName() {
		return this.name;
	}
}
