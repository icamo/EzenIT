
public class Ex05 {
	final String company; 
	final String model;
	int maxSpeed;
	public Ex05(String company, String model) {
		this.company = company;
		this.model = model;
	}
	public void setMaxspeed(int maxSpeed){
		this.maxSpeed = maxSpeed;
	}
	public int getMaxSpeed() {
		return this.maxSpeed;
	}
	public void print() {
		System.out.println(this.company);
		System.out.println(this.model);
	}
}