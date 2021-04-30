package package8;

public class Ex19 implements Ex17, Ex18{
	int num1;
	int num2;
	void setData(int num1, int num2) {
		this.num1= num1;
		this.num2 = num2;
	}
	// Ex17
	@Override
	public void add() {
		System.out.println(num1 + num2);		
	}
	@Override
	public void sub() {
		System.out.println(num1 - num2);		
	}
	// Ex18
	@Override
	public void mul() {
		System.out.println(num1 * num2);				
	}
	@Override
	public void div() {
		System.out.println(num1 / num2);				
	}
	

}
