
public class Ex09 {
	String company;
	String model;
	String color;
	int maxSpeed;
	// this()생성자는 생성자에서 다른 생성자를 사용할 때 씀. 
	public Ex09(String company, String model, int maxSpeed) {
		this(company, model);
		this.maxSpeed = maxSpeed;
	}
	
	public Ex09(String company, String model, String color) {
		this(company,model);
		this.color = color;
	}
	
	public Ex09(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	// this를 붙여주는 이유는 class내에 있는 멤버필드이다.
	public void setCompany(String company) {
		this.company = company;
	}
	public String getCompany() {
		return this.company;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return this.model;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getColor() {
		return this.color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
}
